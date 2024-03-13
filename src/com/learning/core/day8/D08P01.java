package com.learning.core.day8;

public class D08P01 {

	public static void main(String[] args) {
		Queue q = new Queue(4);
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		System.out.print("Elements in queue: ");
		q.disp();
		System.out.print("\nAfter removing element: ");
		q.dequeue();
		q.disp2();
		
	}

}
class Queue{
	int front= -1;
	int rear= -1;
	int arr[];
	int n;
	public Queue(int n) {
		this.n=n;
		this.arr=new int[n];
	}
	public boolean isFull() {
		return n-1==rear;
	}
	public boolean isEmpty() {
		return front==-1&&rear==-1;
	}
	public void enqueue(int data) {
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
	public int dequeue() {
		if(isEmpty()) {
			System.out.print("Queue is Empty");
			return -1;
		}
		else if(rear==front) {
			int top = arr[front];
			rear=-1;
			front=-1;
			return top;
		}
		else {
			int top=arr[front];
			front++;
			return top;
		}
	}
	public int peek() {
		if(isEmpty()) {
			System.out.print("Queue is Empty");
			return -1;
		}
		else {
			int top=arr[front];
			return top;
		}
	}
	public void disp() {
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public void disp2() {
		for(int i=this.front;i<=this.rear;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}