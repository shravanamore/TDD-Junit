package com.epam.TDD_Junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DeleteTest
{

	DeleteChar deleteObject = new DeleteChar();
	@Test
	void testF1() 
	{
		assertEquals("BCD",deleteObject.deleteFirstAs("ABCD"));
	}
	@Test
	void testF2() 
	{
		assertEquals("CD", deleteObject.deleteFirstAs("AACD"));
	}
	@Test
	void testF3()
	{
		assertEquals("BCD",deleteObject.deleteFirstAs("BACD"));
	}
	@Test
	void testF4()
	{
		assertEquals("BBAA",deleteObject.deleteFirstAs("BBAA"));
	}
	@Test
	void testF5()
	{
		assertEquals("BAA",	deleteObject.deleteFirstAs("AABAA"));
	}
	@Test
	void testF6() 
	{
		assertEquals("",deleteObject.deleteFirstAs(""));
	}
	
	
    
}
