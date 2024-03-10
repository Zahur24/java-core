package com.learning.core.day5;

import java.util.*;

public class D05P01 {
    public static void main(String[] args) {
        Register<Object> register = new Register<>();
        Scanner sc = new Scanner(System.in);

        //Employee
        System.out.println("Enter Employee details: ");
        System.out.print("Name: ");
        String empName = sc.nextLine();
        System.out.print("Phone No: ");
        long empPhoneNo = Long.parseLong(sc.nextLine());
        System.out.print("Employee ID: ");
        int empId = Integer.parseInt(sc.nextLine());
        System.out.print("Passport No: ");
        String empPassportNo = sc.nextLine();
        Employee emp = new Employee(empName, empPhoneNo, empId, empPassportNo);
        register.display(emp);

        // Taking input for Student
        System.out.println("\nEnter Student details:");
        System.out.print("Name: ");
        String stuName = sc.nextLine();
        System.out.print("Phone No: ");
        long stuPhoneNo = Long.parseLong(sc.nextLine());
        System.out.print("License No: ");
        int stuLicenseNo = Integer.parseInt(sc.nextLine());
        System.out.print("Pan Card No: ");
        String stuPanCardNo = sc.nextLine();
        Student stu = new Student(stuName, stuPhoneNo, stuLicenseNo, stuPanCardNo);
        register.display(stu);
    }
}



class Employee {
    private String name;
    private long phoneNo;
    private String passportNo;
    private int licenseNo;
    private String panCardNo;
    private int voterId;
    private int employeeId;

    
    public Employee(String name, long phoneNo, int employeeId, String passportNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.employeeId = employeeId;
        this.passportNo = passportNo;
    }

    public Employee(String name, long phoneNo, int employeeId, int licenseNo, String panCardNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.employeeId = employeeId;
        this.licenseNo = licenseNo;
        this.panCardNo = panCardNo;
    }

    public Employee(String name, long phoneNo, int employeeId, int voterId, int licenseNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.employeeId = employeeId;
        this.voterId = voterId;
        this.licenseNo = licenseNo;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}

	public int getLicenseNo() {
		return licenseNo;
	}

	public void setLicenseNo(int licenseNo) {
		this.licenseNo = licenseNo;
	}

	public String getPanCardNo() {
		return panCardNo;
	}

	public void setPanCardNo(String panCardNo) {
		this.panCardNo = panCardNo;
	}

	public int getVoterId() {
		return voterId;
	}

	public void setVoterId(int voterId) {
		this.voterId = voterId;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
   
}

class Student {
    private String name;
    private long phoneNo;
    private String passportNo;
    private int licenseNo;
    private String panCardNo;
    private int voterId;

    
    public Student(String name, long phoneNo, String passportNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.passportNo = passportNo;
    }

    public Student(String name, long phoneNo, int licenseNo, String panCardNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.licenseNo = licenseNo;
        this.panCardNo = panCardNo;
    }

    public Student(String name, long phoneNo, int voterId, int licenseNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.voterId = voterId;
        this.licenseNo = licenseNo;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}

	public int getLicenseNo() {
		return licenseNo;
	}

	public void setLicenseNo(int licenseNo) {
		this.licenseNo = licenseNo;
	}

	public String getPanCardNo() {
		return panCardNo;
	}

	public void setPanCardNo(String panCardNo) {
		this.panCardNo = panCardNo;
	}

	public int getVoterId() {
		return voterId;
	}

	public void setVoterId(int voterId) {
		this.voterId = voterId;
	}

   
}

class Register<T> {

    public String generateRegisterId(int n) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }

        return sb.toString();
    }

    public void display(T user) {
        if (user instanceof Employee) {
            Employee emp = (Employee) user;
            System.out.println(generateRegisterId(7) + " " + emp.getName() + " " + emp.getPhoneNo() + " " +
                    emp.getEmployeeId() + " " + emp.getPassportNo());
        } else if (user instanceof Student) {
            Student stu = (Student) user;
            System.out.println(generateRegisterId(7) + " " + stu.getName() + " " + stu.getPhoneNo() + " " +
                    stu.getLicenseNo() + " " + stu.getPanCardNo());
        }
    }
}
