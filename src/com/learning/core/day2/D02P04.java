package com.learning.core.day2;
import java.util.*;
public class D02P04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int b= sc.nextInt();
		int c=sc.nextInt();
		int k = a>b?(a>c?a:c):(b>c?b:c);
		System.out.print(k);

	}

}
