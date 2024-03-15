package com.learning.core.day2;
import java.util.*;
public class D02P10 {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		String s="";
		while(n>0)
		{
			int rem=n%10;
			s=s+rem;
			n=n/10;
		}
		System.out.print(s);
		
	}
}
