package com.learning.core.day3;
import java.util.*;
public class D03P04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int [n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			int c=0,b=0;
			for(int j=i;j<n;j++)
			{
				if(a[i]==a[j])
				{
					if(c==1)
					{
						System.out.print(j);
						b=1;
					}
					c++;
				}
			}
			if(b==1) {
				break;
			}
		}

	}

}
