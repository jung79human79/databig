package 단순if조건문;

import java.util.Scanner;

public class Ex01단순if조건문 {

	public static void main(String[] args) {
	   //입력도구 꺼내오기
	   Scanner sc = new Scanner(System.in);
	   //나이를 입력하세요 출력하기 (개행없이)
	   System.out.print("나이를 입력하세요>> ");
	   //나이 데이터 입력받기
	   int age = sc.nextInt();
	   // age>=20이면 "성인입니다" 출력하기-->조건문사용
	   if(age>=20){
		  System.out.println("성인입니다.");  //15를 입력하면 아무것도 실행안됨  
	}
  }
}