package test;

import static org.junit.Assert.assertEquals;
import junit.framework.TestCase;

/**
 * BasicMath 클래스 연산 테스트 케이스
 * @author mezeet
 */
import org.junit.Test;

/**
 *  기본 연산 테스트 케이스
 * @author mezeet
 * @see http://bcho.tistory.com/86
 */

public class BasicMathTest extends TestCase {

	
	private BasicMath testItem ;
	
	/**
	 *  테스트 전 실행할 공통 작업 - 예 ) 커넥션 생성 등
	 */
	protected void setUp() throws Exception {
		testItem = new BasicMath();
	}
	
	/**
	 *  테스트 후 실행할 공통 작업 - 예 ) DB 커넥션 닫기
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
