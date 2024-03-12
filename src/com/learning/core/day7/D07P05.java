package com.learning.core.day7;

public class D07P05 {

	public static void main(String[] args) {
		Stack5 s = new Stack5(4);
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.rev();

	}

}


class Stack5 {
	public int n;
	public int arr[];
	public int top;
	public Stack5(int n) {
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
			System.out.println("Stack5 is Full");
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
	public void rev() {
		System.out.print(pop()+" ");
		if(!(isEmpty())) {
			rev();
		}
	}
	
}
