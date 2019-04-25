package com.test.springapp.spring_app.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.test.springapp.spring_app.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, String> {

	// fetch all users
	List<User> findAll();

	// save user details
	User save(User user);

}
