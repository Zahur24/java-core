package com.learning.core.day8;
import java.util.*;
public class D08P04 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String [] a = s.split(" ");
		Queue4 q = new Queue4(a.length);
		for(int i=0;i<a.length;i++) {
			q.enqueue(a[i]);
		}
		int c=0;
		while(!q.isEmpty()) {
			if(q.dequeue()=="") {
				
			}
			else
			{
				c++;	
			}
		}
		if(c==0) {
			System.out.print("Empty");
		}
		else {
			System.out.print("Not Empty");
		}
	}
}
class Queue4
{
	int front= -1;
	int rear= -1;
	String arr[];
	int n;
	public Queue4(int n) {
		this.n=n;
		this.arr=new String[n];
	}
	public boolean isFull() {
		return n-1==rear;
	}
	public boolean isEmpty() {
		return front==-1&&rear==-1;
	}
	public void enqueue(String data) {
		if(isFull()) {
			System.out.print("Queue is full");
		}
		else if(isEmpty()) {
			front=rear=0;
			arr[rear]=data;
		}
		else {
			rear++;
			arr[rear]=data;
		}
	}
	public String dequeue() {
		if(isEmpty()) {
			return("Queue is Empty");
		}
		else if(rear==front) {
			String top = arr[front];
			rear=-1;
			front=-1;
			return top;
		}
		else {
			String top=arr[front];
			front++;
			return top;
		}
	}
	public String peek() {
		if(isEmpty()) {
			return("Queue is Empty");
			
		}
		else {
			String top=arr[front];
			return top;
		}
	}
}

