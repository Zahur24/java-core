package com.learning.core.day2;
import java.util.*;
public class D02P17 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=2;i<=n;i++) {
			boolean bn = true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					bn=false;
					break;
				}
			}
			if(bn==true)
			{
				System.out.print(i+" ");
			}
		}

	}

}
