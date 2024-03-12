package com.learning.core.day6;
import java.util.*;
public class D06P11 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		Hashtable<Integer,Employee> ht = new Hashtable<>();
		ht.put(1001,new Employee(1001,"Daniel","Analyst","L&D"));
		ht.put(1002,new Employee(1002,"Thomas","Tester","Testing"));
		ht.put(1003,new Employee(1003,"Robert","Product Manager","Development"));
		ht.put(1004,new Employee(1004,"Grace","Tech Support","HR"));
		System.out.print("Enter the id to find : ");
		int id=sc.nextInt(),c=0;
		for(Map.Entry<Integer,Employee> x:ht.entrySet()) {
			if(x.getValue().getId()==id) {
				System.out.println(x.getValue());
				c++;
				break;
			}
		}
		if(c==0) {
			System.out.println("Not Found");
		}
	}
}

class Employee{
	private int id;
	private String name;
	private String department;
	private String designation;
	public Employee(int id, String name, String designation, String department) {
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
		Employee other = (Employee) obj;
		return Objects.equals(department, other.department) && Objects.equals(designation, other.designation)
				&& id == other.id && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return this.id+" "+this.name+" "+this.designation+" "+this.department;
	}
	
}