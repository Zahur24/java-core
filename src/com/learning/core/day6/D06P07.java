package com.learning.core.day6;
import java.util.*;
public class D06P07 {
	public static void main(String[]args) {
		
		TreeMap<Car3,Integer> m = new TreeMap<>();
		m.put(new Car3("Bugatti",80050.0),1);
		m.put(new Car3("Swift",305000.0),2);	
		m.put(new Car3("Audi",600100.0),3);
		m.put(new Car3("Benz",900000.0),4);		
	//	int n=m.size();
		System.out.println( m.firstKey());
		System.out.println( m.lastKey());
	}
}

class Car3 implements Comparable<Car3>{
	private double price;
	private String name;
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car3(String name,double price) {
		super();
		this.price = price;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car3 other = (Car3) obj;
		return Objects.equals(name, other.name)
				&& price==other.price;
	}

	@Override
	public String toString() {
		return this.name+" "+this.price;
	}
	public int compareTo(Car3 other) {
		return Double.compare(other.price,this.price);
	}
	
}