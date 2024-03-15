package com.learning.core.day9;
import java.util.Scanner;
public class D09P01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();	//size of array
		int arr[]=new int[n];
		for(int i=0;i<n;i++)	//enter elements
		{
			arr[i]=sc.nextInt();
		}
		QuickSort q=new QuickSort();
	
		q.quickSort(arr, 0, n-1);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}
	
}
class QuickSort
{
	public int partition(int arr[],int leftt,int right)
	{
		int pivot=arr[leftt];
		int start=leftt;
		int end=right;
		while(start<end)
		{
			start=start+1;
			while(start<=right && arr[start]<pivot)
			{
				start++;
			}
			while(end>=leftt && arr[end]>pivot)
			{
				end--;
			}
			if(start<end)
			{
				int temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
			}
		}
		int temp=arr[leftt];
		arr[leftt]=arr[end];
		arr[end]=temp;
		return end;
	}
	public void quickSort(int arr[],int leftt,int right)
	{
		int p;
		if(leftt<right)
		{
			p=partition(arr,leftt,right);
			quickSort(arr,leftt,p-1);
			quickSort(arr,p+1,right);
		}
	}
}