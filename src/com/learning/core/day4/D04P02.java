package com.learning.core.day4;
import java.util.Scanner;

public class D04P02 {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            CricketRating r = new CricketRating(sc.next(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
            r.display();
        } catch (ArithmeticException e) {
            System.out.println("NotEligible");
        }
    }
}

class CricketRating {
    private String playerName;
    private float critic1;
    private float critic2;
    private float critic3;
    private float avgRating;

    public CricketRating(String name, float c1, float c2, float c3) {
        this.playerName = name;
        if (c1 > 0 && c2 > 0 && c3 > 0) {
            calculateAverageRating(c1, c2, c3);
        } else if (c1 > 0 && c2 > 0) {
            calculateAverageRating(c1, c2);
        } else {
            this.avgRating = c1;
        }
    }

    public void calculateAverageRating(float critic1, float critic2) {
        this.critic1 = critic1;
        this.critic2 = critic2;
        this.avgRating = (critic1 + critic2) / 2;
    }

    public void calculateAverageRating(float critic1, float critic2, float critic3) {
        this.critic1 = critic1;
        this.critic2 = critic2;
        this.critic3 = critic3;
        this.avgRating = (critic1 + critic2 + critic3) / 3;
    }

    public String calculateCoins() {
        if (this.avgRating > 7) {
            return "gold";
        } else if (this.avgRating >= 5 && this.avgRating < 7) {
            return "silver";
        } else if (this.avgRating >= 2 && this.avgRating < 5) {
            return "copper";
        } else {
            throw new ArithmeticException("NotEligibleException");
        }
    }

    public void display() {
    	if(calculateCoins().equals("copper")||calculateCoins().equals("silver")||calculateCoins().equals("gold"))
    	{
    		System.out.print(this.playerName);
            System.out.printf(" %.2f ", avgRating);
            
    	}
    	System.out.print(calculateCoins());
    }
}
