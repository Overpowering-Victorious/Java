package com.example.repository;

import java.util.List;

import com.example.entity.Book;

public interface BookRepository {
	void add(Book b);
	boolean delete(Object ob);
	boolean update_book(Book b);
	List<Book> list(Object ob);
}
