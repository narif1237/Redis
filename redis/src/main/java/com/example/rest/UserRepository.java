package com.example.rest;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

	public interface UserRepository {

	    void save(User user);
	    //Map<String, User> findAll();
	   User findById(String id);
	    void update(User user);
	    void delete(String id);
	}

