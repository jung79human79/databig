package 산출연산자;

import java.util.Scanner;

public class Ex03산술연산자예제 {

	public static void main(String[] args) {
//System.out.print("결과 값 : " + (num1/100*100) ); // int 값이므로 456을 100으로 나누면 4가되고 거기에 100을 곱하니 400
//System.out.println(num1/100*100);  //불필요코드              
				
	//1. 입력받는 도구 꺼내기
	Scanner sc =new Scanner(System.in);
	//2. 정수입력 출력하기(개행없이)
 	System.out.print("정수입력 : ");
	//3. 정수 입력받기
	int num1 = sc.nextInt();
	//4. 백의 자리 이하 버리기
	int result = num1 - num1%100;    // 456 - 456%100 // 나머지를 뺀다
	//5. 결과값 출력하기
	System.out.println("결과 값 : " + result );
	
	//다른 방법
	System.out.print("정수입력 : ");
	int num2 = sc.nextInt();
	int result2 = num1/100*100;
	System.out.println("결과 값 : " + result2 );
	
	//다른 방법
	System.out.print("정수입력 : ");
	int num3 = sc.nextInt();
	System.out.print("결과 값 : ");
	System.out.println(num3/100*100);
	System.out.println("결과 값 : " + num3/100*100);	
		
	}

}
