package if_else문;

import java.util.Scanner;

public class Ex03입장료계산다른방법 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("==== 에버랜드에 오신 것을 환영합니다! ==== ");
		System.out.print("나이를 입력하세요>> ");
		int age = sc.nextInt();
		System.out.print("인원수를 입력하세요>> ");
		int people = sc.nextInt();
		
		int money = 0;  // 메인함수안에 대표 변수를 선언 초기값으로 0을 준다 //if절 에서 계산시 영향을 주면안되므로~
		
		if (age<20) {
			money = (int) (5000*people*0.5);  //메인의 선언한 변수를 가져다 재사용 한번 자료형 주었으므로 안줘도됨
		}else {
			money = 5000*people; //메인의 선언한 변수를 가져다 재사용 한번 자료형 주었으므로 안줘도됨	
		}
		
		System.out.print("입장료는 " + money + "입니다.");
		// 만약 money변수를 메인이 아닌 다른 {}에 사용하면 재사용도 동일한{}에서만 가능하다
		// 메인이 아닌 {}안에 변수를 선언시 그 변수를 지역변수라 한다 말그대로 그 지역에서만 적용되는 변수 
		// 하지만 메인에 쓰면 대표로 어디든 사용가능하다.
		// ***지역변수(=local variable)***는 {}안의 영역에서 선언한 변수는 {}안에서만 사용이 가능
		// {}안의 영역을 scope 라고 부른다.	
	}
}
