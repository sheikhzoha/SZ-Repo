package com.sheikh.springjwt.config;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.sheikh.springjwt.utils.JwtUtil;
@Component
public class JwtTokenFilter extends OncePerRequestFilter{

	@Autowired
	JwtUtil jwtUtils;
	
	@Autowired
	UserDetailsService userDetailsService;
	
	
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		
		String jwt=null;
		String username=null;
		final String authorizationHeader = request.getHeader("Authorization");
		
		if(authorizationHeader!=null && authorizationHeader.startsWith("Bearer")) {
			jwt=authorizationHeader.substring(7);
			username= jwtUtils.extractUsername(jwt);
		}
		
		if(username!=null && SecurityContextHolder.getContext().getAuthentication()==null) {
			UserDetails userdetails =userDetailsService.loadUserByUsername(username);
			if(jwtUtils.validateToken(jwt, userdetails)) {
				UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new 
						UsernamePasswordAuthenticationToken(userdetails, null, userdetails.getAuthorities());
				usernamePasswordAuthenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
				SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
			}
		}
		 
		filterChain.doFilter(request, response);
		
		
		
		
	}

}
