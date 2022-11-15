package com.UST.ustempregistrationservice.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.UST.ustempregistrationservice.model.User;
  
public interface UserRepository extends JpaRepository<User,Integer> {
	List<User>findByEmail(String email);
}
 