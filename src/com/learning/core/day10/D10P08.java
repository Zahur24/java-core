package com.learning.core.day10;
import static org.junit.Assert.*;
import org.junit.Test;
public class D10P08 {
		
	@Test
	public void testAdd() {
		assertEquals(20,Calculator2.add(10, 10));
	}
	@Test
	public void testSub() {
		assertEquals(15,Calculator2.sub(30, 15));
	}
	@Test
	public void testMul() {
		assertEquals(250,Calculator2.mul(25,10));
	}
	@Test
	public void testDiv1() {
		assertEquals(6,Calculator2.div(60,10));
	}
	@Test(expected = ArithmeticException.class)
	public void testDiv2() {
		assertEquals(20,Calculator2.div(200, 0));
	}
}
class Calculator2{
	public static int add(int a, int b)
	{
		return a+b;
	}
	public static int sub(int a, int b)
	{
		return a-b;
	}
	public static int mul(int a, int b)
	{
		return a*b;
	}
	public static int div(int a, int b)
	{
		return a/b;
	}
}