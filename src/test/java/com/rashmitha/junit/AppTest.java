package com.rashmitha.junit;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;


public class AppTest 
{
	public RemoveAs remove=new RemoveAs();
	
	
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
	public void Test1A()
	{
		assertEquals("BCD",remove.remove("ABCD"));
	}
	@Test
	public void TestA()
	{
		assertEquals("BCD",remove.remove("BACD"));
	}
	
	@Test
	public void Test2A()
	{
		assertEquals("BC",remove.remove("AABC"));
	}
	
	@Test
	public void AafterIndex2()
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
