package com.learning.core.day8;
import java.util.Scanner;

class Node
{
	int value;
	Node next;
	
	public Node(int value)
	{
		this.value=value;
		this.next=null;
	}
}

class LinkedlistQueue
{
	Node front,rear;
	
	public void enqueue(int data)
	{
		if(front==null)
		{
			rear=new Node(data);
			front =rear;
		}
		else
		{
			Node newNode=new Node(data);
			rear.next=newNode;
			rear=newNode;
		}
	}
	public int dequeue()
	{
		int res;
		if(front==null)
		{
			System.out.println("Queue is Empty");
			return -1;
		}
		else
		{
			res=front.value;
			front=front.next;
			return res;
		}
	}
}

public class D08P02 
{
	public static void main(String[] args)
	{
		LinkedlistQueue q=new LinkedlistQueue();
		Scanner sc=new Scanner(System.in);
		String [] a = sc.nextLine().split(" ");
		for(int i=0;i<a.length;i++)
		{
			q.enqueue(Integer.parseInt(a[i]));
		}
		System.out.print("Elements in queue: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(Integer.parseInt(a[i])+" ");
		}
		q.dequeue();
		q.dequeue();
		Node current = q.front;
		System.out.print("\nAfter removing 2 elements: ");
        while (current != null) 
        {
            System.out.print(current.value+" ");
            current = current.next;
        }
		
	}
}