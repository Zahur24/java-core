package com.learning.core.day3;
import java.util.*;
public class D03P13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sen = sc.nextLine();
		String s = sen.replaceAll(" ", "%20");
		System.out.print(s);

	}

}
