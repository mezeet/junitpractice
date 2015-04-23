package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BasicMathTest {

	private BasicMath testItem ;
	protected void setUp() throws Exception {
		testItem = new BasicMath();
	}
	protected void tearDown() throws Exception {
		testItem = null ;
	}
	@Test
	public void testAddition() {
		assertEquals(5, testItem.addition(2, 3));
	}
	@Test
	public void testMultiply() {
		assertEquals(6, testItem.multiply(2, 3));
	}
		
	
}
