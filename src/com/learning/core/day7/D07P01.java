package com.learning.core.day7;

public class D07P01 {

	public static void main(String[] args) {
		Stack1 s = new Stack1(4);
		s.push("Hello");
		s.push("world");
		s.push("java");
		s.push("Programming");
		System.out.print("After Pushing 4 Elements: ");
		s.display();
		s.pop();
		System.out.print("\nAfter a Pop: ");
		s.display();
	}

}


class Stack1 {
	public int n;
	public String arr[];
	public int top;
	public Stack1(int n) {
		super();
		this.n = n;
		this.arr = new String [n];
		this.top = -1;
	}
	public boolean isEmpty() {
		return (top==-1);
	}
	public boolean isFull() {
		return (n-1 == top);
	}
	public void push(String data) {
		if(isFull()) {
			System.out.println("Stack1 is Full");   //overflow
		}
		else {
		top++;
		arr[top] = data;
		}
	}
	public String pop() {
		if(isEmpty()) {
			return ("Stack1 is Empty");
			
		}
		else {
			String value = arr[top];
			top--;
			return value;
		}
	}
	public String peek() {
		if(isEmpty()) {
			return ("Stack1 is Empty");
		}
		else {
			return arr[top];
		}
	}
	public void display() {
		for(int i=0;i<=top;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
}
