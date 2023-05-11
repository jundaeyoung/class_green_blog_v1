package com.tenco.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tenco.blog.model.User;

// @Repository  //여기서는 생략가능하다.
public interface UserRepository extends JpaRepository<User, Integer> {
	// JpaRepository를 세팅하는 순간 자동으로
	// select, selectAll, insert, update, delete, 다 만들어줌

	// spring jpa 네이밍 전략
	// 메서드 이름으로 JPA가 쿼리를 만들어 준다.
	// SELECT * FROM user WHERE username = ? AND password = ?;
	User findByUsernameAndPassword(String username, String password);

}
