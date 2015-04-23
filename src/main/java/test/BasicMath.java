package test;

/**
 * 간단한 계산을 처리하는 클래스
 * @author mezeet
 */
public class BasicMath {

	
	/**
	 *  더하기 연산 메소드
	 * @param int i 기본 변수
	 * @param int j 기본 변수
	 * @return int i+j 덧셈 연산의 결과
	 */
	public int addition(int i, int j) {
		int k=i+j;
		return k;
	}

	/**
	 *  곱하기 연산 메소드
	 * @param int i 기본 변수
	 * @param int j 기본 변수
	 * @return int i*j 곱셈 연산의 결과
	 */
	public int multiply(int i, int j) {
		int k =i*j;
		return k;
	}

}
