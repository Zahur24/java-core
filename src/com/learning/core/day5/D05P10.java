package com.learning.core.day5; 

import java.util.TreeSet;

class Person10 implements Comparable<Person10> {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Person10(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
    	return "id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Person10 person = (Person10) obj;
        return id == person.id;
    }

    @Override
    public int compareTo(Person10 other) {
        return Integer.compare(this.id, other.id);
    }
}

public class D05P10 {
    public static void main(String[] args) {
        TreeSet<Person10> z = new TreeSet<Person10>();
        z.add(new Person10(1, "Terry", 22, 999.0));
        z.add(new Person10(2, "Smith", 20, 2999.0));
        z.add(new Person10(3, "Popeye", 24, 5999.0));
        z.add(new Person10(4, "Jones", 22, 6999.0));
        z.add(new Person10(5, "John", 32, 1999.0));
        z.add(new Person10(6, "Tom", 42, 3999.0));
        int c=0;
        for (Person10 x : z) {
           if(x.getName().startsWith("J")) {
        	   System.out.println(x);
        	   c++;
        	   break;
           }
        }
        if(c==0) {
        	System.out.println("No name Starts with letter J");
        }
       
    }
}
