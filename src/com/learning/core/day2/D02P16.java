package com.learning.core.day2;
import java.util.*;
public class D02P16 {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a=0,b=1;
		for(int i=1;i<=n;i++)
		{
			if(i==1) {
				System.out.print(a);
			}
			else {
				System.out.print(","+a);
			}
			int c=a+b;
			a=b;
			b=c;
		}
	}
}
