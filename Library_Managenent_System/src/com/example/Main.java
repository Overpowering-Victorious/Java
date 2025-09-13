package com.example;

import java.util.List;
import java.util.Scanner;

import com.example.service.BookServiceImpl;
import com.example.entity.Book;
import com.example.service.BookService;

public class Main {
	
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
		BookService bookService=new BookServiceImpl();		
		int type=0,action=0;
		while(true)
		{
			System.out.println("Main Menu: ");
			System.out.print("1) Book\n2) User\n3) Loan Record\n");
			type=sc.nextInt();
			if(type==99) break;
			while(true)
			{
				if(type==1)
				{
					System.out.println("Book Menu: ");
					System.out.print("1) Add Book\n2) Update Book Details\n3) Delete Book by Id\n"
							+ "4) Delete Book by Name\n5) Search Book by Id\n6) Search Book by Name\n");
				}
				action=sc.nextInt();
				if(type==1)
				{
					if(action==1 || action ==2)
					{
						int id=0, quantity=0;
						String title=null, description=null, author=null, publisher=null;
						double price=0.0;
						
						System.out.print("Enter Id: ");
						id=sc.nextInt();
						
						System.out.print("Enter book title: ");
						title=sc.next();
						
						System.out.print("Enter book description: ");
						description=sc.next();
						
						System.out.print("Enter book price: ");
						price=sc.nextDouble();
						
						System.out.print("Enter book author name: ");
						author=sc.next();
						
						System.out.print("Enter book publisher: ");
						publisher=sc.next();
						
						System.out.print("Enter book quantity: ");
						quantity=sc.nextInt();
						System.out.println();
						
						Book b=new Book(id,quantity,title,description,author,publisher,price);
						
						if(action==1)
							bookService.add(b);
						else
							bookService.update_book(b);
					}
					else if(action==3)
					{
						int id=-1;
						System.out.print("Enter the book Id to be delete: ");
						id=sc.nextInt();
						if(bookService.delete(id))
							System.out.println("Item deleted sucessfully");
						else
							System.out.println("Cannot find the book");
						System.out.println();
					}
					else if(action==4)
					{
						String name;
						System.out.print("Enter the book name to be deleted: ");
						name=sc.next();
						if(bookService.delete(name))
							System.out.println("Item deleted sucessfully");
						else
							System.out.println("Cannot find the book");
						System.out.println();
					}
					else if(action==5)
					{
						int id=-1;
						System.out.print("Enter book Id to find: ");
						id=sc.nextInt();
						List<Book>tmp=bookService.list(id);
						if(tmp!=null)
							System.out.println(tmp.toString());
						else
							System.out.println("No book found");
						System.out.println();
					}
					else if(action==6)
					{
						String name=null;
						System.out.print("Enter book name to find: ");
						name=sc.next();
						List<Book>tmp=bookService.list(name);
						if(tmp!=null)
							System.out.println(tmp.toString());
						else
							System.out.println("No book found");
						System.out.println();
					}
					else
						break;
				}
				else
					break;
			}
		}
		
	}

}
