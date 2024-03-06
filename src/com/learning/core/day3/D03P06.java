package com.learning.core.day3;
import java.util.Scanner;

public class D03P06 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("string: ");
        String input = sc.nextLine();
        System.out.print("Vowels to count at end : ");
        int num = sc.nextInt();
        String last = check(input, num);
        if (last.equals("nothing")) 
        {
            System.out.println("Mismatch in Vowel Count");
        } else 
        {
            System.out.println("Last " + num + " vowels from the end: " + last);
        }
    }

    public static String check(String str, int n)
    {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (isVowel(ch)) 
            {
                count++;
                sb.insert(0, ch);
                if (count == n)
                {
                    return sb.toString();
                }
            }
        }
        if (count < n)
        {
            return "nothing";
        }

        return sb.toString();
    }
    
    public static boolean isVowel(char ch) 
    {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}