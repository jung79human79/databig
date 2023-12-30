package 산출연산자;

import java.util.Scanner;

public class Ex02산술연산자예제 {

	public static void main(String[] args) {
		// 1.입력도그 꺼내오기
		Scanner sc =new Scanner(System.in);
		// 2. 입력받기
	    String name = sc.next();
	    // 3.정수형 숫자 입력받기
	    int num1 = sc.nextInt();
		System.out.println("입력받은 글자는 >> "+name);
		System.out.println("숫자를 입력하세여>> "+num1);     //ln 줄바꿈
		
		//주석 단축키 : ctrl+/
		
		
		// 1.정수입력 글자 출력
		System.out.print("첫번째 정수 입력 :");     
		// 2.정수입력
		int num2 = sc.nextInt();
		// 3. 정수입력 글자 출력
		System.out.print("두번째 정수 입력 :");
		// 4.정수입력
		int num3 = sc.nextInt();     // 입력을 받은 후 개행이 된다 즉 입력의 최종은 입력 후 엔터를 치는 것이다 고로 줄바꿈이 된다
		
		// 5.더한 결과 값 출력 (연산까지!)
		System.out.println("더한 결과 값 : " + (num2+num3));  // ()을 넣어야 우선 계산이 되고 그 후 문자와 연결
		System.out.println("뺀 결과 값 : "+ (num2-num3));     // +는 연결 연산자 기능
		System.out.println("곱한 결과 값 : "+ (num2*num3));     //()을 안넣어도 계산됨 +보다 우선순위 이므로 *와/는~
		System.out.println("나눈 결과 값 : "+ (num2/(float)num3));  //정수와 실수를 나누면 실수출력
		System.out.println("나눈 결과 값 : "+ ((double)num2/num3)); //둘 중 어느것이든 실수자료형을 강제로 주면 결국 전체가 기본 실수형(더블)로 되어 출력은 소수로 된다
		// 한줄 복사 단축키 :ctrl+alt+화살표
		
		System.out.print("숫자를 입력하세여>>");
		//int a = sc.nextInt(); 변수를 쓰는 이유는 이 변수를 재사용할 수 있으므로~
		sc.nextInt();
		
		
		
		
		
	}

}
