package com.sheikhcodes.springsecurityjpa.modals;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class Users implements UserDetails{
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String username;
	private String password;
	private boolean active;
	private List<GrantedAuthority> authorities;
	
	public Users() {
		
	}
	
	public Users(String username) {

		this.username=username;
		this.password="pass";
		this.active=true;
		this.authorities= Arrays.asList("ROLE_ADMIN","ROLE_USER").stream().map(s->new SimpleGrantedAuthority(s)).collect(Collectors.toList());
	}
	
	public Users(User user) {

		this.username=user.getUserName();
		this.password=user.getPassword();
		this.active=true;
		this.authorities= Arrays.asList(user.getUserRole().split(",")).stream().map(s->new SimpleGrantedAuthority(s)).collect(Collectors.toList());
		//this.authorities= Arrays.asList("ROLE_ADMIN","ROLE_USER").stream().map(s->new SimpleGrantedAuthority(s)).collect(Collectors.toList());
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return this.authorities;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return this.password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return this.username;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return this.active;
	}

	
}
