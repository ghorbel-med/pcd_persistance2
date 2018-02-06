package com.tritux.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tritux.entity.User;

@Repository("userRepository")
public interface UserRepository  extends JpaRepository<User, Long>{
	
}
