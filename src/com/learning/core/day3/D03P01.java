package com.learning.core.day3;
import java.util.*;
public class D03P01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		System.out.println("length of the string is : "+s1.length());
		System.out.println("Upper case of String is : "+s1.toUpperCase());
		String rev = "";
		for(int i=s1.length()-1;i>=0;i--)
		{
			rev=rev+s1.charAt(i);
			
		}
		if(rev.equals(s1))
		{
			System.out.println("It is a Palindrome");
		}
		else
		{
			System.out.println("It is not a Palindrome");
		}
	}

}
