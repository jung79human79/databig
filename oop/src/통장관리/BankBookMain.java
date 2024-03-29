package 통장관리;

public class BankBookMain {

	public static void main(String[] args) {

		// 실행공간
				// 뱅크북 설계도면을 기반으로 뱅크1이라는 객체를 생성
				// 자료형명= 클래스명
				
				BankBook bank1 = new BankBook(100);    //Bankbook이 설계도 bank1이 객체(설계도로 만들어낸 객체) 하나의 설계도로 여러 객체 만들 수 있다.
				//System.out.println(bank1.money);     //private이므로 에러
				//bank1.money=500;                     //private이므로 에러
				System.out.println(bank1.showMoney());
				System.out.println(bank1.getMoney());
				bank1.setMoney(500);            // 돈초기화=돈수정=저장
				// 2. bank1에 500원 입금
				bank1.deposit(500);              // 함수을 호출해서 입력값을 ()안에 주면 함수의 출력이 실행되므로 500원이라는 값이 저장된다
				// 3.출금 300원
				bank1.withdraw(300);
				// 4.잔액확인
				bank1.showMoney();                         // 
				System.out.println(bank1.showMoney());     // return money;를 출력하려면 해당함수를 프린트함수에서 호출해야함
				
				bank1.setMoney(500);                   // 돈초기화=돈수정=저장
				System.out.println(bank1.showMoney());
				System.out.println(bank1.getMoney());
				
				BankBook bank2 = new BankBook(500);
				BankBook bank3 = new BankBook(300);
				
				System.out.println(bank2.getMoney()+bank3.getMoney());
				int a=bank2.getMoney();
				int b=bank3.getMoney();
				System.out.println(a+b);
				
				
				
				
				
				
				
				
				
	}

}
