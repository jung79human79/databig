package 변수및자료형;

import java.util.Scanner;

public class Ex02변수 {
// main을 못 만들었다면 main적고 ctrl+스페이스바로 자동완성
 public static void main(String[] args) {
	//변수선언
	//자료형 변수명 = 값;
	int num = 4;
	//변수사용이유=재사용
	System.out.println(num);
	System.out.println(num+1);  
	//입력도구
	Scanner sc = new Scanner(System.in);
	System.out.print("숫자>>");
	//정수형 숫자 입력받기
	int input = sc.nextInt();
	//입력받은 숫자 출력하기
	System.out.println(input);
	
	//상수 키워드 final 사용
	final int num2 = 3;
	// 변수 값 변경
	num = 5;      // 값 변경가능 자료형 노기록 자료형을 쓰면 중복선언으로 오류
	num = 7;      // 맨마지막 변수값만 출력됨
	// num2 = 10; //에러발생 상수는 값 변경 불가
	System.out.println(num);
	// int input = 15; 변수명 중복선언 불가
	// String input = "ddd"; 자료형을 다르게 해도 중복선언이므로 오류
	input = 55;
	System.out.println(input);
	
	 
	 
}

}
