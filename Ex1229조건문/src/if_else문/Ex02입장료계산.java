package if_else문;

import java.util.Scanner;

public class Ex02입장료계산 {

	public static void main(String[] args) {
        //기본료 5000원,인원수에 따라 지불함,20세미만이 경우 50%할인 //기본료*인원수
		Scanner sc = new Scanner(System.in);
		System.out.println("==== 에버랜드에 오신 것을 환영합니다! ==== ");
		
		System.out.print("나이를 입력하세요>> ");
		int age = sc.nextInt();
		System.out.print("인원수를 입력하세요>> ");
		int people = sc.nextInt();
		if (age<20) {
			// 20세 미만일 경우 50%할인 (기본료 5000원)
			int money = (int) (5000*people*0.5);  //강제형변환 출력은 정수값이다
			//int money1 = 5000*people/2;         // 이식은 강제형변환 할 필요없다 
			//int money3 = 5000*people*50%;       //절대 안됨
			System.out.print("입장료는 " + money + "입니다."); //money변수는 {}안에 변수를 선언한 것이므로 {}에서만 다시 재사용이 가능하다
		} else { 
			// 그렇지 않으면 입장료 그대로 계산
			int money2 = 5000*people;
			System.out.print("입장료는 " + money2 + "입니다.");//money2변수는 {}안에 변수를 선언한 것이므로 {}에서만 다시 재사용이 가능하다
		}
 //else문에서는 소괄호=입력값 주면 에러 입력값은 위에서 한번만 준다 그 조건식의 참 거짓을 판별하므로 다른 조건식을 주면 안됨		
	}
}
