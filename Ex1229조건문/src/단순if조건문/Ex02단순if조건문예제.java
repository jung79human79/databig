package 단순if조건문;

import java.util.Scanner;

public class Ex02단순if조건문예제 {

	public static void main(String[] args) {
		//입력도구 꺼내오기
		  Scanner sc = new Scanner(System.in);
		 //정수를 입력하세요 출력하기 (개행없이)
		  System.out.print("정수를 입력하세요>> ");
		 //정수 데이터 입력받기
		  int num = sc.nextInt();
		 //입력받은 숫자가 3의 배수 이면서 5의 배수인지 비교하기
		  if(num%3==0 && num%5==0) {
			  // 참이라면 3과 5의 배수입니다 출력하기
			  System.out.println("3과 5의 배수입니다.");
		  }	
		  //다른 풀이
		  if (num%3==0) {
			  // 3의 배수이다
			  if (num%5==0) {
				  // 3의 배수 이면서 5의 배수
				  System.out.print("3과 5의 배수입니다.");
			  }
		  }		
	}
}
