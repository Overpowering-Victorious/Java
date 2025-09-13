package com.example.entity;

public class Book {
	private int id, quantity;
	private String title, description, author, publisher;
	private double price;
	
	public Book(){}
	
	public Book(int id, int quantity, String title, String description, String author, String publisher, double price)
	{
		this.id = id;
		this.quantity = quantity;
		this.title = title;
		this.description = description;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString()
	{
		return "Book [id=" + id + ", quantity=" + quantity + ", title=" + title + ", description=" + description
				+ ", author=" + author + ", publisher=" + publisher + ", price=" + price + "]";
	}
	
}
