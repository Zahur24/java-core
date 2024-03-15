package com.learning.core.day9;
import java.util.*;
public class D09P02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();	//enter the elements
		}
		System.out.print("Before MergeSort : ");
		display(arr);
		mergeSort(arr,0,arr.length-1);	//left index, right index
		System.out.print("After MergeSort : ");
		display(arr);
	}
	public static void mergeSort(int a[],int left,int right) {
		if(left<right) {						//up-to sub-array have single element
			int mid=(left+right)/2;
			mergeSort(a,left,mid);
			mergeSort(a,mid+1,right);
			merge(a,left,mid,right);
		}
	}
	public static void merge(int a[],int left,int mid,int right) {
		int n1=mid+1-left;
		int n2=right-mid;						//right-1-mid+1
		int [] leftArray = new int[n1];
		int [] rightArray = new int[n2];
		for(int i=0;i<n1;i++) {			//copy elements to left sub array
			leftArray[i]=a[i+left];
		}
		for(int j=0;j<n2;j++) {			//copy elements to right subarray
			rightArray[j]=a[j+mid+1];
		}
		
		int i=0,j=0,k=left;		//k for copying elements	//i=left index check  //j=right index check
		
		while(i<n1 && j<n2)		//n1&n2 are lengths do not include '='
		{
			if(leftArray[i]<=rightArray[j]) {		//swapping 
				a[k]=leftArray[i];			
				i++;
			}
			else {
				a[k]=rightArray[j];
				j++;
			}
			k++;
		}
		
		//Adding remaining elements
		
		while(i<n1)
		{
			a[k]=leftArray[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			a[k]=rightArray[j];
			j++;
			k++;
		}
	}
	
	public static void display(int a[]) {
		for(int x:a) {
			System.out.print(x+" ");
		}
		System.out.println();
	}
}
