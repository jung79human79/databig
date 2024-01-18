package 인터페이스;

public interface Temp {

	// 인터페이스란?  추상화와 유사하다 하지만 다르다.
    // : 클래스들이 공통으로 구현해야 하는 기능(강제성)들을 미리 정의
	// : 프로젝트 설계도면 혹은 작업 명세서(지켜야 하는 규칙)
		
	// 인터페이스 특징
	//1.필드에 들어걸 수 있는 데이터타입은 반드시 상수만 그리고 초기화 하거나 값을 줘야 한다.
	//2.static 키워드가 있는 필드만 선언 가능하다.(기존에 매서드에 있던 것이 필드로~)
	//  static 고정적인 메모리 저장 공간 , static이 붙으면 1순위로 실행시키는 공간
	// 3.필드에서는 static final 두개의 키워드는 생략가능하다.
	// 4.반드시 추상 매서드만 가질 수 있다 = 틀을 정해준다
	// 5. --> 매서드 선언시 abstract 키워드 생략이 가능하다.
	
	// 6. implements 키워드를 사용해서 상속받을 수 있다
	// 7. 인터페이스는 다중 상속이 가능하다 (원래 상속은 다중 안된다)
	
	
	// 1. 필드
	//public static final int num = 0;  //상수를 무조건 선언 
	public  int num = 0;  //상수를 무조건 선언 // static final 키워드 생략 
	
	//2 .매서드
	public void temp();  // abstract 키워드 생략
}
