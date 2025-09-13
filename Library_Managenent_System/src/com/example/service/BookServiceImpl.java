package com.example.service;

import java.util.List;

import com.example.entity.Book;

public class BookServiceImpl implements BookService {

	@Override
	public void add(Book b) {
		bookRepository.add(b);
	}

	@Override
	public boolean delete(Object ob) {
		return bookRepository.delete(ob);
	}

	@Override
	public boolean update_book(Book b) {
		return bookRepository.update_book(b);
	}

	@Override
	public List<Book> list(Object ob) {
		return bookRepository.list(ob);
	}

}
