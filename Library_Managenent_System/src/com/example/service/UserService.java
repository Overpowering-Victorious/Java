package com.example.service;

import java.util.List;

import com.example.entity.User;
import com.example.repository.UserRepository;
import com.example.repository.UserRepositoryImpl;

public interface UserService {
	
	UserRepository userRepository=new UserRepositoryImpl();
	
	void add(User b);
	boolean delete(Object ob);
	boolean update_book(User b);
	List<User> list(Object ob);
}
