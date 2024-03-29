package com.learning.core.day6;
import java.util.*;
public class D06P13{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		Hashtable<Integer,Employee13> ht = new Hashtable<>();
		ht.put(1001,new Employee13(1001,"Daniel","Analyst","L&D"));
		ht.put(1002,new Employee13(1002,"Thomas","Tester","Testing"));
		ht.put(1003,new Employee13(1003,"Robert","Product Manager","Development"));
		ht.put(1004,new Employee13(1004,"Grace","Tech Support","HR"));
		ht.put(1005,new Employee13(1005,"Charles","QA Lead","Testing"));
		System.out.println(ht.size());
		
		
	}
}

class Employee13{
	private int id;
	private String name;
	private String department;
	private String designation;
	public Employee13(int id, String name, String designation, String department) {
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
		Employee13 other = (Employee13) obj;
		return Objects.equals(department, other.department) && Objects.equals(designation, other.designation)
				&& id == other.id && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return this.id+" "+this.name+" "+this.designation+" "+this.department;
	}
	
}