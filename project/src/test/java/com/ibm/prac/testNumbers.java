package com.ibm.prac;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class testNumbers {

	
	private static Numbers numbers;
	
	@BeforeAll
	public static void setup() {
		numbers = new Numbers();
	}
	
	@Test
	public void testAdd() {
		assertEquals(10, numbers.add(5, 5));
	}
	
	@Test
	public void testSubs() {
		assertEquals(10, numbers.subs(20, 10));
	}
	
	@Test
	public void testDiv() {
		assertEquals(3, numbers.div(9, 3));
	}
	
	@Test
	public void testZeroDiv() {
		assertThrows(ArithmeticException.class, () -> numbers.div(2,0));
	}
	
	@Test
	public void testSquare() {
		assertEquals(25, numbers.square(5));
	}
	
	@Test
	public void testIncorrectSquare() {
		assertNotEquals(10, numbers.square(3));
	}
}







