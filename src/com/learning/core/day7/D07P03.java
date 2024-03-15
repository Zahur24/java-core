package com.learning.core.day7;

public class D07P03 {

	public static void main(String[] args) {
		String str = "JavaQuiz";
		int n=str.length();
		Stack3 s = new Stack3(n);
		for(int i=0;i<n;i++) {
			s.push(str.charAt(i));
		}
		s.display();
	}

}
 class Stack3 {
	public int n;
	public char arr[];
	public int top;
	public Stack3(int n) {
		super();
		this.n = n;
		this.arr = new char [n];
		this.top = -1;
	}
	public boolean isEmpty() {
		return (top==-1);
	}
	public boolean isFull() {
		return (n-1 == top);
	}
	public void push(char data) {
		if(isFull()) {
			System.out.println("Stack3 is Full");
		}
		else {
		top++;
		arr[top] = data;
		}
	}
	public char pop() {
		if(isEmpty()) {
			System.out.println("tack is Empty");
			return '!';
		}
		else {
			char value = arr[top];
			top--;
			return value;
		}
	}
	public char peek() {
		if(isEmpty()) {
			System.out.println("tack is Empty");
			return '!';
		}
		else {
			return arr[top];
		}
	}
	public void display() {
		while(!(isEmpty())) {
			System.out.print(pop());
		}
	}
}
