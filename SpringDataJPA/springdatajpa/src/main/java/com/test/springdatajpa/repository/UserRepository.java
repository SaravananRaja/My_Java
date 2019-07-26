package com.test.springdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.springdatajpa.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	User findByNameAndPassword(String name,String password);
}
