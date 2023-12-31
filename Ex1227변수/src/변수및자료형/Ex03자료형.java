package 변수및자료형;

public class Ex03자료형 {
	public static void main(String[] args) {
		//자바 기본 자료형
		//1.논리자료형 : boolean(1byte) 참,거짓을 나타냄
		// 예:참이라는 데이터를 저장하는 bool 변수 선언
		boolean bool = true;
		bool = false;              // 자료형 노기록
		System.out.println(bool);  //맨마지막 변수값 적용
		
		//2.문자 자료형 : char(2byte) : 한 글자만 기록가능 단따옴표
		char name = '정';
		// 참고 문자열 자료형 : 기본자료형 아니다 쌍따옴표 여러 글자
		String name2 = "정대주";
		System.out.println(name);
		System.out.println(name2);
		
		//3.정수자료형 (데이터의 크기가 의미하는 건 표현할수 있는 범위)
		// byte(1byte) short(2byte) int(4byte) iong(8byte)
		// 정수를 작성하면 java는 기본적으로 int로 인식
		
		//강제(명시)적 형변환 큰 크기의 자료형에서 작은 크기의 자료형으로 변환시 사용
		//데이터 손실이 발생할 수 있으므로 ()을 사용하여 손실이 발생해도 괜찮다고 명시함
		byte num1 = (byte) -129;
		System.out.println(num1);
		double num2 =3.14;
		int num3 = (int) num2;
		System.out.println(num2);
		System.out.println(num3);
		
		// 자동 형변환 (묵시적 형변환)
		long num4 = 1000;    //작은 크기의 값이 자동으로 큰 크기의 자료형으로 형 변환
		System.out.println(num4);
		float num5 = 1000;
		System.out.println(num5);
		double num6 = 1000;
		System.out.println(num6);
		System.out.println( (float) num4);
		System.out.println( (double) num4);
		
		// 4.실수자료형
		// 3.14라는 데이터를 담는 double 형태의 변수 num7 선언
		double num7 = 3.14;
		float num8 = (float) 3.1414;   //더 큰거를 작은거에 넣으면 오류
		float num9 = 3.1515f;         //키워드를 붙여도 형변환
			   
		System.out.println(num8);
		System.out.println(num9);
	}
}