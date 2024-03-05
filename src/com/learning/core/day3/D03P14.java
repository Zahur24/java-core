package com.learning.core.day3;
import java.util.*;
public class D03P14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int m = sc.nextInt();
		int b[] = new int[m];
		for(int i=0;i<m;i++)
		{
			b[i]=sc.nextInt();
		}
		int l =m+n;
		int k[]=new int[l];
		for(int i=0;i<n;i++)
		{
			k[i]=a[i];
		}
		for(int i=0;i<m;i++) {
			k[i+n]=b[i];
		}
		Arrays.sort(k);
		System.out.print("Union : "+k[0]+" ");
		for(int i=1;i<l;i++)
		{
			if(k[i]!=k[i-1]) {
				System.out.print(k[i]+" ");
			}
		}
		System.out.print(" Intersection : ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(a[i]==b[j]) {
					System.out.print(a[i]+" ");
				}
			}
		}
	}

}
