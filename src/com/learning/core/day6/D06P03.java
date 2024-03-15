package com.learning.core.day6;
import java.util.*;
@SuppressWarnings("deprecation")
public class D06P03 {
    public static void main(String[] args) {
        TreeSet<Book> books = new TreeSet<>();
        
        books.add(new Book(1001, "Python Learning", 715.0, "Martic C. Brown", new Date(2020,2, 2)));	//yyyy-mm-dd
        books.add(new Book(1002, "Modern Mainframe", 295.0, "Sharad", new Date(1997,5,19)));
        books.add(new Book(1003, "Java Programming", 523.0, "Gilad Bracha", new Date(1984,11,23)));
        books.add(new Book(1004, "Read C++", 295.0, "Henry Harvin", new Date(1984, 11,19)));
        books.add(new Book(1005, ".Net Platform", 3497.0, "Mark J. Price", new Date(1984,3,6)));
        for (Book x : books) {
            System.out.println(x);
        }
    }
}
@SuppressWarnings("deprecation")
class Book implements Comparable<Book> {
	
    private int bookId;
    private String title;
    private double price;
    private String author;
    public Date dateOfPublication;

    public Book(int bookId, String title, double price, String author, Date dateOfPublication) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
        this.author = author;
        this.dateOfPublication = dateOfPublication;
    }

    public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getDateOfPublication() {
		return dateOfPublication;
	}

	public void setDateOfPublication(Date dateOfPublication) {
		this.dateOfPublication = dateOfPublication;
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, bookId, dateOfPublication, price, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && bookId == other.bookId
				&& Objects.equals(dateOfPublication, other.dateOfPublication)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(title, other.title);
	}

	public String toString() {
 
        return bookId + " " + title + " " + price + " " + author + " "+ dateOfPublication.getDate()+"/"+dateOfPublication.getMonth()+"/"+dateOfPublication.getYear();
    }
	public int compareTo(Book other) {
		return Integer.compare(this.bookId,other.bookId);	//return this.bookId-other.bookId;
	}
}
