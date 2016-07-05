package test.java;

import main.java.Largest;
import junit.framework.TestCase;

public class TestLargest extends TestCase{

	public void testCase1() throws Exception
	{
		int []arr= {4,6,7,4,9};
		Largest obj = new Largest();
		assertEquals(9, obj.find(arr));
	}
	public void testCase2() throws Exception
	{
		int []arr= {4,6,7,4,19};
		Largest obj = new Largest();
		assertEquals(19, obj.find(arr));
	}
	public void testCase3() throws Exception
	{
		int []arr= {-4,-6,-7,-4,-19};
		Largest obj = new Largest();
		assertEquals(-4, obj.find(arr));
	}
	public void testCase4()
	{
		int []arr= {};
		Largest obj = new Largest();
		try {
			assertEquals(-4, obj.find(arr));
		} catch (Exception e) {
			assertEquals("Array is empty", e.getMessage());
		}
	}
}
