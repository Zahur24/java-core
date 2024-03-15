package com.learning.core.day10;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class D10P07 {
		
		@Test
		public void testAdd() {
			assertEquals(18,Calculator1.add(9, 9));
		}
		@Test
		public void testSub() {
			assertEquals(18,Calculator1.sub(27, 9));
		}

}
class Calculator1{
	public static int add(int a, int b)
	{
		return a+b;
	}
	public static int sub(int a, int b)
	{
		return a-b;
	}
}