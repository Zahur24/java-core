package com.learning.core.day6;
import java.util.*;
import java.util.Map.Entry;
public class D06P02 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		Map<String,Long> m = new LinkedHashMap<>();
		m.put("Amal",998787823L);
		m.put("Manvitha",937843978L);
		m.put("Joseph",7882221113L);
		m.put("Smith",8293893311L);
		m.put("Kathe",7234560011L);
		System.out.print("Enter the key to find its value :");
		String k=sc.next();
		if(m.containsKey(k)) {
			System.out.println(m.get(k));
		}
		else {
			System.out.println("Not Found");
		}
	}
}
