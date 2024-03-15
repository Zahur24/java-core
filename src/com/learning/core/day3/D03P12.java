package com.learning.core.day3;
import java.util.*;
public class D03P12 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        if (check(input)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    public static boolean check(String input) {
        if (input == null || input.length() < 4) {
            return false;
        }

        int[] a = new int[300];

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            a[c]++;
        }

        int Charcount = 0;
        for (int count : a) {
            if (count > 0) {
                Charcount++;
            }
            if (Charcount == 4) {
                return true;
            }
        }

        return false;
    }

}
