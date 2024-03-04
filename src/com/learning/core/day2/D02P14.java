package com.learning.core.day2;
import java.util.*;
public class D02P14 {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int base = sc.nextInt();
		int n = sc.nextInt(),pow=1;
		for(int i=1;i<=n;i++)
		{
			pow=pow*base;
		}
		System.out.println(pow);
	}
}
