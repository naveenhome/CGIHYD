package test.java;

import main.java.RPNCalc;
import junit.framework.TestCase;

public class TestRPN extends TestCase{
	public void testCase1()
	{
		String expr = "2,2,+"; 
		RPNCalc obj = new RPNCalc();
		assertEquals(4, obj.calculate(expr));
	}
	public void testCase2()
	{
		String expr = "2,5,+"; 
		RPNCalc obj = new RPNCalc();
		assertEquals(7, obj.calculate(expr));
	}
	public void testCase3()
	{
		String expr = "2,5,+,3,+"; 
		RPNCalc obj = new RPNCalc();
		assertEquals(10, obj.calculate(expr));
	}

}
