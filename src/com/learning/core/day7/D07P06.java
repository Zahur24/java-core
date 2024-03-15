package com.learning.core.day7;

public class D07P06 {
	public static void main(String[]args) {
		Stack6 s = new Stack6(5);	//statically taking 5 elements
		s.push(16);
		s.push(15);
		s.push(29);
		s.push(19);
		s.push(18);
		s.getMin();
	}
}


class Stack6 {
	public int n;
	public int arr[];
	public int top;
	public Stack6(int n) {
		super();
		this.n = n;
		this.arr = new int [n];
		this.top = -1;
	}
	public boolean isEmpty() {
		return (top==-1);
	}
	public boolean isFull() {
		return (n-1 == top);
	}
	public void push(int data) {
		if(isFull()) {
			System.out.println("Stack6 is Full");
		}
		else {
		top++;
		arr[top] = data;
		}
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("tack is Empty");
			return -1;
		}
		else {
			int value = arr[top];
			top--;
			return value;
		}
	}
	public int peek() {
		if(isEmpty()) {
			System.out.println("tack is Empty");
			return -1;
		}
		else {
			return arr[top];
		}
	}
	public void getMin() {
		int min=arr[0];
		for(int i=0;i<=top;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println(min);
	}
}
