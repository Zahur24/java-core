package com.learning.core.day1;

public class D01P01 {
	public Book createBooks()
	{
		Book b = new Book();
		return b;
	}
	public void showBooks(Book b)
	{
		b.set("Java Programming",350.00);
		
		System.out.print("Book Title:"+b.gettitle()+" and Price: "+b.getprice());
	}
	public static void main(String[]args)
	{
		D01P01 obj1 = new D01P01();
		obj1.showBooks(obj1.createBooks());
	}

}
