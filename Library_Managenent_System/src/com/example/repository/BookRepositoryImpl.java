package com.example.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.entity.Book;

public class BookRepositoryImpl implements BookRepository {
	
	private List<Book>books=new ArrayList<>();

	@Override
	public void add(Book b)
	{
		books.add(b);
	}

	@Override
	public boolean delete(Object ob)
	{
		if(ob instanceof Integer)
			return deleteById(ob);
		else if(ob instanceof String)
			return deleteByName(ob);
		else
			return false;
	}

	private boolean deleteByName(Object ob)
	{
		String name=(String)ob;
		for(Book b: books)
		{
			if(b.getTitle()==name)
			{
				books.remove(b);
				return true;
			}
		}
		return false;
	}

	private boolean deleteById(Object ob)
	{
		int id=(Integer)ob;
		for(Book b: books)
		{
			if(b.getId()==id)
			{
				books.remove(b);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean update_book(Book b)
	{
		for(Book e: books)
		{
			if(e.getId()==b.getId())
			{
				if(b.getDescription()!=null)
					e.setDescription(b.getDescription());
				if(b.getPrice()!=0.0)
					e.setPrice(b.getPrice());
				if(b.getAuthor()!=null)
					e.setAuthor(b.getAuthor());
				if(b.getPublisher()!=null)
					e.setPublisher(b.getPublisher());
				if(b.getQuantity()!=0)
					e.setQuantity(b.getQuantity());
				if(b.getTitle()!=null)
					e.setTitle(b.getTitle());
				return true;
			}
		}
		return false;
	}

	@Override
	public List<Book> list(Object ob)
	{
		if(ob instanceof Integer)
			return listById(ob);
		else if(ob instanceof String)
			return listByName(ob);
		else if(ob==null)
			return books;
		return null;
	}

	private List<Book> listByName(Object ob) {
		String name=(String)ob;
		List<Book>tmp=new ArrayList<>();
		for(Book b: books)
		{
			if(b.getTitle()==name)
				tmp.add(b);
		}
		return tmp;
	}

	private List<Book> listById(Object ob) {
		int id=(Integer)ob;
		List<Book>tmp=new ArrayList<>();
		for(Book b: books)
		{
			if(b.getId()==id)
				tmp.add(b);
		}
		return tmp;
	}

}
