package com.learning.core.day2;
import java.util.*;
public class D02P09 {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),cube;
		for(int i=1;i<=n;i++)
		{
			cube = i*i*i;
			System.out.print(cube+" ");
		}
		
	}
}
