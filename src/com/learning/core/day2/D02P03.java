package com.learning.core.day2;
import java.util.*;
public class D02P03 {
	
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		System.out.println("Select the Arithematic operation ");
		char ch =sc.next().charAt(0);
		switch(ch)
		{
		case '+':
			System.out.println(n1+n2);
			break;
		case '-':
			System.out.println(n1-n2);
			break;
		case '*':
			System.out.println(n1*n2);
			break;
		case '/':
			System.out.println(n1/n2);
			break;
		case '%':
			System.out.println(n1%n2);
			break;
		default:
			System.out.println("Invalid Input");
		}
	}
}
