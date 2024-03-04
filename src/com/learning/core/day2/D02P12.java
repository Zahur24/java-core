package com.learning.core.day2;
import java.util.*;
public class D02P12 {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),x=(2*n)-1;
		for(int i=1;i<=x;i++)
		{
			for(int j=1;j<=x;j++)
			{
				if(j<=x-i+1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			i++;
		}
		
	}
}
