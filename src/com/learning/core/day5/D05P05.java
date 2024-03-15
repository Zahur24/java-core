package com.learning.core.day5;
import java.util.*;
public class D05P05 {
	public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	HashSet<Product5> z = new LinkedHashSet<Product5>();
    
	z.add(new Product5("P001", "Maruti 800"));
    z.add(new Product5("P002", "Maruti Zen"));
    z.add(new Product5("P003", "Maruti Dezire"));
    z.add(new Product5("P004", "Maruti Alto"));
    String toRemove = sc.next();
    
    
   /* for(Product5 y:z) {
    	if(y.getId().equals(toRemove)) {
    		z.remove(y);					//Alternate way
    		break;
    	}
    }*/
    
    Iterator<Product5> i = z.iterator();
    while (i.hasNext()) {
        Product5 pro = i.next();
        if (pro.getId().equals(toRemove)) {
            i.remove(); // Removing using the iterator
        }
    }
    
	for(Product5 x:z) {
		System.out.println(x);
	}
	
	}
	
}
class Product5{
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
	public Product5(String id, String name) {
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
		Product5 other = (Product5) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}
}