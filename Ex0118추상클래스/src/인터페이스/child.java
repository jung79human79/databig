package 인터페이스;

import 월급계산프로그램.Emplotee;  //다른 패키지의 클래스

public class child extends Emplotee implements Temp, Temp2{

	public child(String empno, String name, int pay) {  //child 클래스 생성자
		super(empno, name, pay);    // 부모클래스 생성자 매서드를 호출
	}

	@Override
	public int getMoneyPay() {  // implement 오버라이드
		return 0;             // Emplotee class의 추상매서드(getMoneyPay())의 재정의=오버라이드=구현 
	}

	@Override
	public void temp() {    // Temp interface의 추상매서드(temp())의 재정의=오버라이드=구현 
		
	}
     
	    // implements 키워드를 사용해서 상속받을 수 있다
		// 인터페이스는 다중 상속이 가능하다 (원래 상속은 다중 안된다)
	
}
