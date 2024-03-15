package com.learning.core.day5; 

import java.util.TreeSet;

class Person3 implements Comparable<Person3> {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Person3(int id, String name, int age, double salary) {
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
        return "Person3 [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
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
        Person3 person = (Person3) obj;
        return id == person.id;
    }

    @Override
    public int compareTo(Person3 other) {
        return Integer.compare(this.id, other.id);
    }
}

public class D05P08 {
    public static void main(String[] args) {
        TreeSet<Person3> z = new TreeSet<>();
        z.add(new Person3(1, "Jerry", 22, 999.0));
        z.add(new Person3(2, "Smith", 20, 2999.0));
        z.add(new Person3(3, "Popeye", 24, 5999.0));
        z.add(new Person3(4, "Jones", 19, 6999.0));
        z.add(new Person3(5, "John", 32, 1999.0));
        z.add(new Person3(6, "Tom", 42, 3999.0));

        for (Person3 x : z) {
            System.out.println(x.getName().toUpperCase());
        }
    }
}
