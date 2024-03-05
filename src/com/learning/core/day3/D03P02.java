
	package com.learning.core.day3;

	import java.util.Scanner;

	public class D03P02 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n1=sc.nextInt();
			int n2=sc.nextInt();
			int a[]=new int[5];
			for(int i=0;i<5;i++) {
				a[i]=sc.nextInt();
			}
			if(check(a,n1)&&check(a,n2)) {
				System.out.println("Its Bingo.");
			}
			else {
				System.out.println("Not Found.");
			}
		}
		public static boolean check(int[] arr,int n) {
			int l=arr.length;
			for(int i=0;i<l;i++) {
				if(arr[i]==n) {
					return true;
				}
			}
			return false;
		}
	}

