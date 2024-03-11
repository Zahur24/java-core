package com.learning.core.day6;
import java.util.*;
public class D06P08 {
	public static void main(String[]args) {
		TreeMap<Car4,Integer> m = new TreeMap<>();
		m.put(new Car4("Bugatti",80050.0),1);
		m.put(new Car4("Swift",305000.0),2);	
		m.put(new Car4("Audi",600100.0),3);
		m.put(new Car4("Benz",900000.0),4);		
		
		m.remove(m.lastKey());
		for(Car4 x: m.keySet()) {
			System.out.println(x);
		}
	}
}
class Car4 implements Comparable<Car4>{
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

	public Car4(String name,double price) {
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
		Car4 other = (Car4) obj;
		return Objects.equals(name, other.name)
				&& price==other.price;
	}

	@Override
	public String toString() {
		return this.name+" "+this.price;
	}
	public int compareTo(Car4 other) {
		return Double.compare(this.price,other.price);
	}
	
}