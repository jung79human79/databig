package 산출연산자;

public class Ex01산술연산자 {

	public static void main(String[] args) {
		float num1 = 7.0f ;   // ? float실수인데 왜 2.0은 에러?
		long num2 = 10;
		System.out.println(num2/num1);  //크기로는 long가 크지만 기본형이 정수는 int 실수는 double이므로 더큰 실수로 출력
		
		// 산술연산자
		// / : 몫
		// % : 나머지
		// 정수형 10이라는 데이터 num3
		// 실수형 7f이라는 데이터 num4		
		int num3 = 10;
		float num4 = 7f;  //자동형변환
		// 정수형/실수형 연산시 자동으로 실수형으로 변환
		System.out.println(num3/num4);
		// +:연결연산가능 (숫자와문자)
		int num5 = 10;
		String num6 = "7";
		System.out.println(num5+num6);  //107 
		//문자+숫자 --> 연결의 의미! 연산이 안됨
		//문자+숫자 = 문자열자료형! 문자가 더 크므로 자동 형변환	
		String a = 5+2+"7";   // 비에러 숫자+문자=문자열 연산은 왼->오
		String b = "5"+2+7;    //"5"+2 가 문자열 그리고 +로 연결해서 7
		//String c = 5+2+7;     //에러 정수값이므로
		String d = 5+"2"+7;    
		String e = "5"+(2+7); 
		System.out.println(a);
		System.out.println(b);
		System.out.println(d);
		System.out.println(e);
		
	}

}
