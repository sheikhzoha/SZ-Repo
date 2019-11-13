package com.sheikhcodes.springsecurityjpa.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sheikhcodes.springsecurityjpa.modals.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{
	
	public User findByUserName(String username);
	
	
}
