package com.learning.core.day3;
import java.util.*;
public class D03P07 {
	public static int c=0;
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        String s = sc.next();
	        check(s);
	    }

	    public static void check(String input) {
	        sub(input, "", 0);
	    }

	    public static void sub(String input, String current, int index) {
	        if (index == input.length()) {
	            if (!current.isEmpty()) {
	            	c++;
	            	if(c==1) {
	                System.out.print(current);
	            	}
	            	else {
	            		System.out.print(", "+current);
	            	}
	            }
	            return;
	        }

	        sub(input, current, index + 1);
	        sub(input, current + input.charAt(index), index + 1);
	    }
}

