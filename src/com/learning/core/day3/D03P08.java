package com.learning.core.day3;

import java.util.Scanner;

public class D03P08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String input = sc.next();
        int del = Del(input);
        System.out.println(del);
    }

    public static int Del(String s) {
        int l = subseq(s);
        return s.length() - l;
    }

    public static int subseq(String s) {
        int n = s.length();
        int[][] z = new int[n][n];

        for (int i = 0; i < n; i++) {
            z[i][i] = 1;
        }

        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                if (s.charAt(i) == s.charAt(j)) {
                    z[i][j] = z[i + 1][j - 1] + 2;
                } else {
                    z[i][j] = Math.max(z[i][j - 1], z[i + 1][j]);
                }
            }
        }
        return z[0][n - 1];
    }
}

