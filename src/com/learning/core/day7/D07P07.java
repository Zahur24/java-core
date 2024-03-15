package com.learning.core.day7;

public class D07P07{
	public static void main(String[]args) {
		Stack7 s = new Stack7(5);	//statically taking 5 elements
		s.push(40);
		s.push(30);
		s.push(25);
		s.push(15);
		System.out.print(s.check());
	}
}


class Stack7 {
	public int n;
	public int arr[];
	public int top;
	public Stack7(int n) {
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
			System.out.println("Stack7 is Full");
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
	public boolean check() {
		if(peek()%2==0) {
			return true;
		}
		else {
			return false;
		}
	}
}
