package 삼항연산자;

public class Ex01삼항연산자예제 {

	public static void main(String[] args) {
    //삼항연산자
    // 조건문 ? 실행문1 : 실행문2
	// 조건문 참이면 실행문1 거짓이면 실행문2
		int num1 = 4;
		int num2 = 7;
		String result = num1 < num2 ? "num2가 더크다" : "num1이 더크다";
	// 반환할 값이 문자열이므로 	String 자료형
		System.out.println(result);	
	}
}
