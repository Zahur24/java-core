package com.learning.core.day9;
import java.util.*;
public class D09P03 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	//size of array
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();	//enter the elements
		}
		System.out.print("Enter element to search: ");
		int key=sc.nextInt();
		boolean present = linearSearch(a,key);
		if(present) {
			System.out.print("Element is Present");
		}
		else {
			System.out.print("Element is not Present");
		}
	}
	public static boolean linearSearch(int a[],int key)
	{
		int l = a.length;
		for(int i=0;i<l;i++)
		{
			if(a[i]==key) {
				return true;
			}
		}
		return false;
	}
}
