package com.learning.core.day4;
import java.util.*;
public class D04P01 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		try {
			BankAccount ac = new BankAccount(sc.nextInt(),sc.next(),sc.next(),sc.nextFloat());
			float bal = ac.getBalance();
			System.out.println("Task Success");
		}
		catch(ArithmeticException e) {
			System.out.print(e.getMessage());
		}
	}
}
class BankAccount{
	private int accNo;
	private String custName;
	private String accType;
	private float balance;
	
	public BankAccount(int no,String name,String type,float bal) {
		this.accNo=no;
		this.custName=name;
		this.accType=type;
		deposit(bal);
	}
	public void deposit(float amt)
	{
		if(amt<0)
		{
			throw new ArithmeticException("NegativeAmount");
		}
		this.balance=amt;
	}
	public float getBalance(){
		if(this.accType.equals("Saving")&&this.balance<1000 || this.accType.equals("Current")&&this.balance<5000) {
			throw new ArithmeticException("LowBalance");
		}
		return this.balance;
	}
	
}
