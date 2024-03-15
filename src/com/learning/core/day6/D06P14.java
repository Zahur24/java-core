package com.learning.core.day6;
import java.util.*;
public class D06P14{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		Hashtable<Integer,Emp> ht = new Hashtable<>();
		ht.put(1001,new Emp(1001,"Daniel","Analyst","L&D"));
		ht.put(1002,new Emp(1002,"Thomas","Tester","Testing"));
		ht.put(1003,new Emp(1003,"Robert","Product Manager","Development"));
		ht.put(1004,new Emp(1004,"Grace","Tech Support","HR"));
		
		Hashtable<Integer,Emp> e = new Hashtable<>();
		
		e.put(1005,new Emp(1005,"Charles","QA Lead","Testing"));
		e.put(1006,new Emp(1006,"Henry","Accountant","Finance"));
		
		e.putAll(ht);
		
		for(Emp x:e.values()) {
			System.out.println(x);
		}
	}
}

class Emp{
	private int id;
	private String name;
	private String department;
	private String designation;
	public Emp(int id, String name, String designation, String department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.designation = designation;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public int hashCode() {
		return Objects.hash(department, designation, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		return Objects.equals(department, other.department) && Objects.equals(designation, other.designation)
				&& id == other.id && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return this.id+" "+this.name+" "+this.designation+" "+this.department;
	}
	
}