package com.learning.core.day5;
import java.util.*;
public class D05P02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> a = new ArrayList<String>();
		System.out.println("Enter the number of students: ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			String str = sc.next();
			a.add(str);
		}
		System.out.println("Enter name to find: ");
		String name=sc.next();
		int c=0;
		for(String x:a) {
			if(x.equals(name)) {
				System.out.print("Found");
				c++;
				break;
			}
		}
		if(c==0) {
			System.out.print("Not Found");
		}
		
	}

}
