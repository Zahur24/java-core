package com.learning.core.day3;
import java.util.*;
public class D03P10 {

	public static int check(String s) {
        int n = s.length();
        for (int len = n / 2; len > 0; len--) {
            if (s.substring(0, len).equals(s.substring(n - len))) {
                return len;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("give string: ");
        String input = scanner.nextLine();
        System.out.println(check(input));
    }

}
