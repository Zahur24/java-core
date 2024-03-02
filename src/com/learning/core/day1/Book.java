package com.learning.core.day1;

public class Book {
	
	public String book_title;
	public double book_price;
	public void set(String name,double money)
	{
		this.book_title = name;
		this.book_price = money;
	}
	public String gettitle()
	{
		return this.book_title;
	}
	public double getprice()
	{
		
		return this.book_price;
	}
}
