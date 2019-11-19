package com.sheikh.springjwt.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sheikh.springjwt.modals.AuthenticateRequest;
import com.sheikh.springjwt.modals.AuthenticationResponse;
import com.sheikh.springjwt.utils.JwtUtil;

@RestController
public class HomeResource {
	
	@Autowired
	AuthenticationManager authManager;
	
	@Autowired
	JwtUtil jwtUtils;
	
	@Autowired
	UserDetailsService userDetailsService;

	@PostMapping("/authenticate")
	public ResponseEntity<?> authenticate(@RequestBody AuthenticateRequest authRequest) {
		
		try {
			authManager.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword()));
		}catch(BadCredentialsException b) {
			System.out.println("bad credentials");
			//throw new Exception("Incorrect username and password");
		}
		
		UserDetails user = userDetailsService.loadUserByUsername(authRequest.getPassword());
		return ResponseEntity.ok(new AuthenticationResponse(jwtUtils.generateToken(user)));
		
		
	}
	
	@GetMapping("/authenticate1")
	public String authenticate1(String username) {
		return "Welcome "+username;
	}
	
	@GetMapping("/authenticate11")
	public String authenticate12(String username) {
		return "Welcome "+username;
	}
}
