package com.learning.core.day5;

import java.util.*;

class Person implements Comparable<Person> {
    private int personId;
    private String personName;
    private int personAge;
    private double personSalary;

    public Person(int id, String name, int age, double salary) {
        this.personId = id;
        this.personName = name;
        this.setPersonAge(age);
        this.personSalary = salary;
    }

    @Override
    public String toString() {
        return "Id=" + personId + ", name=" + personName + ", age=" + getPersonAge() + ", salary=" + personSalary;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(personId);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return personId == person.personId;
    }

    @Override
    public int compareTo(Person otherPerson) {
        return Integer.compare(this.personId, otherPerson.personId);
    }

    public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public int getPersonAge() {
		return personAge;
	}

	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}

	public double getPersonSalary() {
		return personSalary;
	}

	public void setPersonSalary(double personSalary) {
		this.personSalary = personSalary;
	}

	public boolean isElderThan(int age) {
        return this.personAge > age;
    }
}

public class D05P06 {
    public static void main(String[] args) {
        TreeSet<Person> personSet = new TreeSet<Person>();
        personSet.add(new Person(1, "Jerry", 22, 999.0));
        personSet.add(new Person(2, "Smith", 20, 2999.0));
        personSet.add(new Person(3, "Popeye", 24, 5999.0));
        personSet.add(new Person(4, "Jones", 19, 6999.0));
        personSet.add(new Person(5, "John", 32, 1999.0));
        personSet.add(new Person(6, "Tom", 42, 3999.0));
        for (Person person : personSet) {
            if (person.isElderThan(25)) {
                System.out.println(person);
            }
        }
    }
}
