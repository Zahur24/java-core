package com.learning.core.day2;
import java.util.*;
public class D02P15 {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),np=0,nn=0,nz=0;
		for(int i=1;i<=n;i++)
		{
			int x=sc.nextInt();
			if(x>0) {
				np++;
			}
			else if(x<0)
			{
				nn++;
			}
			else
			{
				nz++;
			}
		}
		System.out.println("No of Positive Numbers: "+np);
		System.out.println("No of Negative Numbers: "+nn);
		System.out.println("No of Zeros Numbers: "+nz);
	}
}
