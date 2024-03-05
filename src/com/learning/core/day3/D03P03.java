package com.learning.core.day3;
import java.util.Scanner;
public class D03P03 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=18;
		int z[]= new int[n];
		for(int i=0;i<n;i++) {
			z[i]=sc.nextInt();
		}
		int sum=0,min=z[0];
		for(int i=0;i<=n-3;i++) {
			sum+=z[i];
			if(z[i]<min && z[i]!=0) {
				min=z[i];
			}
		}
		int avgerage=sum/(n-3);
		z[15]=sum;
		z[16]=avgerage;
		z[17]=min;
		for(int j=0;j<z.length;j++) {
			System.out.print(z[j]+" ");
		}
	}
}