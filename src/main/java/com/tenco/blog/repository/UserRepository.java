package com.tenco.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tenco.blog.model.User;

// @Repository  //여기서는 생략가능하다.
public interface UserRepository extends JpaRepository<User, Integer>{
	// JpaRepository를 세팅하는 순간 자동으로 
	// select, selectAll, insert, update, delete, 다 만들어줌
}
