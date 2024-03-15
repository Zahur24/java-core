package com.learning.core.day3;
import java.util.*;

public class D03P09 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Size: ");
		int n=sc.nextInt();
		String[] str=new String[n];
		System.out.println("Enter Strings: ");
		for(int i=0;i<n;i++) {
			str[i]=sc.next();
		}
		System.out.println("Output:");
		if(seq(str)) {
			System.out.println("Yes");
			for(int i=0;i<n;i++) {
				System.out.print(str[i]+" ");
			}
		}
		else {
			System.out.println("No");
		}
	}
	public static boolean seq(String[] str) {
		Arrays.sort(str);
		for(int i=0;i<str.length-1;i++) {
			int m=str[i].length()-1;
				if(str[i].charAt(m)==str[i+1].charAt(0)) {
					continue;
				}
				else {
					return false;
				}
		}
		return true;
	}

}