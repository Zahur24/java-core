package com.learning.core.day7;
import java.util.Scanner;
import java.util.Stack;
public class D07P04 {

  public static void main(String[] args) 
  {
        Scanner sc = new Scanner(System.in);
        String evaluate = sc.nextLine();
        int result = evaluating(evaluate);
        System.out.println("Output:");
        System.out.println(result);
    }
    public static int evaluating(String expression)
    {
        Stack<Integer> stack = new Stack<>();
        int n = 0;
        char operation = '+';

        for (int i = 0; i < expression.length(); i++) 
        {
            char ch = expression.charAt(i);

            if (Character.isDigit(ch)) 
            {
                n = n * 10 + (ch - '0');
            }

            if ((!Character.isDigit(ch) && ch != ' ') || i == expression.length() - 1) {
                if (operation == '+') 
                {
                    stack.push(n);
                }
                else if (operation == '-') 
                {
                    stack.push(-n);
                }
                else if (operation == '*') 
                
                {
                    stack.push(stack.pop() * n);
                } 
                else if (operation == '/') {
                    stack.push(stack.pop() / n);
                }

                operation = ch;
                n = 0;
            }
        }

        int result = 0;
        while (!stack.isEmpty()) 
        {
            result += stack.pop();
        }
        return result;
    }
}