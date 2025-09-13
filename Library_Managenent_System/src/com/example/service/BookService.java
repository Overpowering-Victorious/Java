package com.example.service;

import java.util.List;

import com.example.repository.BookRepositoryImpl;
import com.example.entity.Book;
import com.example.repository.BookRepository;

public interface BookService {
	BookRepository bookRepository=new BookRepositoryImpl();
	void add(Book b);
	boolean delete(Object ob);
	boolean update_book(Book b);
	List<Book> list(Object ob);
}
