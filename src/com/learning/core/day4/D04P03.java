package com.learning.core.day4;
import java.util.*;
public class D04P03 {

	public static void main(String[] args) {
		Validator check = new Validator();
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Start");
			boolean name = check.isValidApplicantName(sc.nextLine());
			boolean post =  check.isValidPost(sc.nextLine());
			boolean age = check.isValidAge(sc.nextInt());
			System.out.println("all deatils verified");
		}
		catch (CatheyBankException e) {
			System.out.print(e.getMessage());
		}
		finally {
			System.out.println("\nEND");
		}
	}

}
class Validator{
	private String applicantName;
	private String postApplied;
	private int applicantAge;
	public boolean isValidApplicantName(String name) throws CatheyBankException{
		if(name.length()==0) {
			throw new CatheyBankException("Invalid Application Name");
		}
		else {
			return true;
		}
	}
	public boolean isValidPost(String post) throws CatheyBankException{
		if(post.equals("Probationary Officer")||post.equals("Assistant")||post.equals("Special Carde Officer")) {
			return true;
		}
		else {
			throw new CatheyBankException("Invalid Post");
		}
	}
	public boolean isValidAge(int age) throws CatheyBankException{
		if(age>=18 && age<=30) {
			return true;
		}
		else {
			throw new CatheyBankException("Invalid Age");
		}

	}
}

class CatheyBankException extends Exception{
	public CatheyBankException(String msg) {
		super(msg);
	}
}
