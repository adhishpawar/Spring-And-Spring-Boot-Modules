package com.adhish.learning;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseStringTest {
	

	ReverseString reverse = new ReverseString();

	@Test
	public void testReverseString_OneWord() {   //Could be Public but need not In Junit 5
		
		assertEquals("avaJ",reverse.reverseString("Java"));
	}
	
	@Test
	public void testReveseString_MultipleWords() {
		
		assertEquals("ysaE si avaJ",reverse.reverseString("Java is Easy"));
	}

}
