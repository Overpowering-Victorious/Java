package com.example.service;

import java.util.List;

import com.example.entity.User;

public class UserServiceImpl implements UserService {

	@Override
	public void add(User u) {
		userRepository.add(u);
	}

	@Override
	public boolean delete(Object ob) {
		return userRepository.delete(ob);
	}

	@Override
	public boolean update_book(User u) {
		return userRepository.update_book(u);
	}

	@Override
	public List<User> list(Object ob) {
		return userRepository.list(ob);
	}

}
