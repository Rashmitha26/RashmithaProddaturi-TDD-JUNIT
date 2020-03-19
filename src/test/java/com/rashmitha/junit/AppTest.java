package com.rashmitha.junit;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


public class AppTest 
{
	public RemoveAs remove;
	@BeforeEach
	public void init()
	{
		remove=new RemoveAs();
	}
	
	@Test
	public void Test0Char()
	{
		assertEquals("",remove.remove(""));
	}
	
	@Test
	public void TestWithoutA()
	{
		assertEquals("BCD",remove.remove("BCD"));
	}
	
	@Test
	public void TestAtIndex0()
	{
		assertEquals("BCD",remove.remove("ABCD"));
	}
	@Test
	public void TestAtIndex1()
	{
		assertEquals("BCD",remove.remove("BACD"));
	}
	
	@Test
	public void TestFirst2A()
	{
		assertEquals("BC",remove.remove("AABC"));
	}
	
	@Test
	public void AafterIndex1()
	{
		assertEquals("BCDADA",remove.remove("BCDADA"));
	}
	@Test
	public void TestWithABeforeAndAfter()
	{
		assertEquals("BAA",remove.remove("AABAA"));
	}

	
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
