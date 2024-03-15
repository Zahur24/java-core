package com.learning.core.day10;
import static org.junit.Assert.*;
import org.junit.Test;
public class D10P09 {
		
	@Test
	public void testAdd() {
		assertEquals(20,Calculator3.add(10, 10));
	}
	@Test
	public void testSub() {
		assertEquals(15,Calculator3.sub(30, 15));
	}
	@Test
	public void testMul() {
		assertEquals(250,Calculator3.mul(25,10));
	}
	@Test
	public void testDiv1() {
		assertEquals(6,Calculator3.div(60,10));
	}
	@Test(expected = ArithmeticException.class)
	public void testDiv2() {
		assertEquals(20,Calculator3.div(200, 0));
	}
	@Test
	public void testMax1()
	{
		assertEquals(6,Calculator3.findMax(new int[]{1,2,3,4,5,6}));
	}
	@Test
	public void testMax2()
	{
		assertEquals(-1,Calculator3.findMax(new int[]{-1,-2,-3,-4,-5,-6}));
	}
}
class Calculator3{
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
	public static int findMax(int arr[])
	{
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
	}
}