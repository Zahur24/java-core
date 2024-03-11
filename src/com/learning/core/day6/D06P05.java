package com.learning.core.day6;
import java.util.*;
public class D06P05 {
	public static void main(String[]args) {
		Map<Car1,Integer> m = new TreeMap<>();
		m.put(new Car1("Bugatti",80050.0),1);
		m.put(new Car1("Swift",305000.0),2);	//sorting takes place according to keys
		m.put(new Car1("Audi",600100.0),3);		//for Integer,Double,Float etc it takes automatically
		m.put(new Car1("Benz",900000.0),4);		// for user-defined need to over-ride comapreTo
		
		for(Car1 x:m.keySet()) {
			System.out.println(x);
		}
	}
}
class Car1 implements Comparable<Car1>{
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

	public Car1(String name,double price) {
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
		Car1 other = (Car1) obj;
		return Objects.equals(name, other.name)
				&& price==other.price;
	}

	@Override
	public String toString() {
		return this.name+" "+this.price;
	}
	public int compareTo(Car1 other) {
		return Double.compare(this.price,other.price);
	}
	
}