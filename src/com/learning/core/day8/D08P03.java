package com.learning.core.day8;

public class D08P03 {

	public static void main(String[] args) {
		CircularQueue q = new CircularQueue(4);
		q.enqueue(14);
		q.enqueue(13);
		q.enqueue(22);
		q.enqueue(-8);
		System.out.print("Elements in queue: ");
		q.disp();
		System.out.print("\nAfter removing element: ");
		q.dequeue();
		while(!(q.isEmpty())) {
			System.out.print(q.dequeue()+" ");
		}

	}

}
class CircularQueue{
	int front= -1;
	int rear= -1;
	int arr[];
	int n;
	public CircularQueue(int n) {
		this.n=n;
		this.arr=new int[n];
	}
	public boolean isFull() {
		return front==((rear+1)%n);
	}
	public boolean isEmpty() {
		return front==-1&&rear==-1;
	}
	public void enqueue(int data) {
		if(isFull()) {
			System.out.print("Queue is full");
		}
		else if(isEmpty()) {	//Inserting element first time
			front=rear=0;
			arr[rear]=data;
		}
		else {		//inserting element when already elements are present in queue
			rear=(rear+1)%n;
			arr[rear]=data;
		}
	}
	public int dequeue() {
		if(isEmpty()) {
			System.out.print("Queue is Empty");
			return -1;
		}
		else if(rear==front) {		//when queue has only one element left and front & rear present at same point
			int top = arr[front];
			rear=-1;
			front=-1;
			return top;
		}
		else {		
			int top=arr[front];
			front=(front+1)%n;
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
}