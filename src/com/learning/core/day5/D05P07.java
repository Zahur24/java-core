package com.learning.core.day5; 
import java.util.TreeSet;

class Person01 implements Comparable<Person01> {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Person01(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    
    @Override
    public String toString() {
        return  this.id +" "+ this.name+ " " + this.salary;
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
        Person01 person = (Person01) obj;
        return id == person.id;
    }

    
    @Override
    public int compareTo(Person01 other) {
        return Integer.compare(this.id, other.id);
    }
}

public class D05P07 {
    public static void main(String[] args) {
        TreeSet<Person01> z = new TreeSet<Person01>();
        z.add(new Person01(1, "Jerry", 22, 999.0));
        z.add(new Person01(2, "Smith", 20, 2999.0));
        z.add(new Person01(3, "Popeye", 24, 5999.0));
        z.add(new Person01(4, "Jones", 19, 6999.0));
        z.add(new Person01(5, "John", 32, 1999.0));
        z.add(new Person01(6, "Tom", 42, 3999.0));
        for (Person01 x : z) {
            System.out.println(x);
        }
    }
}