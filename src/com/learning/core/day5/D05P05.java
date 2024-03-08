package com.learning.core.day5;
import java.util.*;
public class D05P05 {
	public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	HashSet<Product> z = new LinkedHashSet<Product>();
    
	z.add(new Product("P001", "Maruti 800"));
    z.add(new Product("P002", "Maruti Zen"));
    z.add(new Product("P003", "Maruti Dezire"));
    z.add(new Product("P004", "Maruti Alto"));
    String toRemove = sc.next();
    
    
   /* for(Product y:z) {
    	if(y.getId().equals(toRemove)) {
    		z.remove(y);					//Alternate way
    		break;
    	}
    }*/
    
    Iterator<Product> i = z.iterator();
    while (i.hasNext()) {
        Product pro = i.next();
        if (pro.getId().equals(toRemove)) {
            i.remove(); // Removing using the iterator
        }
    }
    
	for(Product x:z) {
		System.out.println(x);
	}
	
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