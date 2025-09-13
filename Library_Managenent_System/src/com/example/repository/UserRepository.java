package com.example.repository;

import java.util.List;

import com.example.entity.User;

public interface UserRepository {
	void add(User b);
	boolean delete(Object ob);
	boolean update_book(User b);
	List<User> list(Object ob);
}
