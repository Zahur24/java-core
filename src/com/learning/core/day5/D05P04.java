package com.learning.core.day5;
import java.util.*;
public class D05P04 {
	public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	HashSet<Product> z = new LinkedHashSet<Product>();
    
	z.add(new Product("P001", "Maruti 800"));
    z.add(new Product("P002", "Maruti Zen"));
    z.add(new Product("P003", "Maruti Dezire"));
    z.add(new Product("P004", "Maruti Alto"));
    Product search = new Product("P003","Maruti Dezire");
	
		if(z.contains(search)) {
			System.out.print("Found");
		}
		else {
			System.out.print("Not Found");
		}
	/*We can also use for each loop to iterate each object  
	 * and check if the given values are present
	 * or not by using get methods and equals()
	 */
	
	}
	
}
class Product{
	String id;
	String name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Product(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public int hashCode() {
		return Objects.hash(id, name);
	}
	
	public String toString() {
		return id +" "+name;
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}
}