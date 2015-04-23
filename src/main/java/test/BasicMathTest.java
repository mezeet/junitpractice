package test;

import static org.junit.Assert.assertEquals;

import junit.framework.TestCase;

/**
 * BasicMath 클래스 연산 테스트 케이스
 * @author mezeet
 */
import org.junit.Test;

public class BasicMathTest extends TestCase {

	
	private BasicMath testItem ;
	
	/**
	 *  테스트 할 클래스를 연결
	 */
	protected void setUp() throws Exception {
		testItem = new BasicMath();
	}
	
	/**
	 *  테스트 할 클래스와 테스트 케이스 분리하는 메소드
	 */
	protected void tearDown() throws Exception {
		testItem = null ;
	}
	
	/**
	 *  더하기 연산 테스트 케이스
	 *  assertEquals(실제결과, 예상결과)
	 */
	@Test
	public void testAddition() {
		assertEquals(testItem.addition(2, 3),5);
	}
	
	/**
	 *  곱하기 연산 테스트 케이스
	 */
	@Test
	public void testMultiply() {
		assertEquals(testItem.multiply(2, 3),6);
	}
		
	
}
