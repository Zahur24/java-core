package com.learning.core.day10;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
import org.junit.Test;
import static org.junit.Assert.*;
public class D10P10 {
	Scanner sc = new Scanner(System.in);
	@Test(timeout = 2000)		//2000 milliseconds = 2 seconds
	public void testName() {
		
		assertTrue(UserProfile.validateUsername("Zahur"));
	}
	@Test(timeout = 2000)
	public void testPassword() {
		
		assertTrue(UserProfile.validatePassword("zah5r123"));
	}
}

class  UserProfile{
	
	public static boolean validateUsername(String name) {
        Pattern pattern = Pattern.compile("^[a-zA-Z]+$");
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
	}
	
	public static boolean validatePassword(String password) {
        Pattern pattern = Pattern.compile("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8}$");
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
	}
}