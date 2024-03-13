package com.learning.core.day8;
import java.util.Scanner;
public class D08P05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String [] a = s.split(" ");
		Queue q = new Queue(a.length);
		for(String x:a) {
			q.enqueue(Integer.parseInt(x));
		}
		Queue x[]=new Queue[2];
		Queue oddq = new Queue(a.length);
		Queue evenq = new Queue(a.length);
		x[0]=oddq;
		x[1]=evenq;
		while(!q.isEmpty()) {
			int z=q.dequeue();
			if(z%2==0) {
				evenq.enqueue(z);
			}
			else {
				oddq.enqueue(z);
			}
		}
		System.out.print("Odd Queue: ");
		x[0].disp2();
		System.out.print("\nEven Queue: ");
		x[1].disp2();

	}

}
