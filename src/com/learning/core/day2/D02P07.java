package com.learning.core.day2;
import java.util.*;
public class D02P07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a>=0 && a<35) {
			System.out.println("Fail.");
		}
		else if(a>=35 && a<45) {
			System.out.println("Grade C.");
		}
		else if(a>=45 && a<60) {
			System.out.println("Grade B.");
		}
		else if(a>=65 &&a<=100) {
			System.out.println("Grade A.");
		}
		else
		{
			System.out.print("Invalid Input");
		}

	}

}
