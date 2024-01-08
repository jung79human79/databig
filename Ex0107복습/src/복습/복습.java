package 복습;

import java.util.Random;
import java.util.Scanner;

public class 복습 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		System.out.print("정수입력 : ");
//		int num = sc.nextInt();
//		int result = num-num%100 ;
//		//System.out.println("결과값 : " + num/100*100 );
//		System.out.println("결과값 : " + result);

//		System.out.print("정수입력 : ");
//		int num = sc.nextInt();
//		//String result = num%2==0 ? num+"는(은)홀수입니다.":num+"는(은)짝수입니다.";
//		//System.out.print(result);
//		String result = num%2==0 ? "홀수":"짝수";
//		System.out.print(num + "은(는)" + result + "입니다.");

//		System.out.print("농구공 개수 : ");
//		int ball = sc.nextInt();
//		int box = ball%5 == 0 ? ball/5 : ball/5+1;
//		System.out.print("박스개수 : " +box );

//		System.out.print("정수입력 : ");
//		int num = sc.nextInt();
//		if(num%3==0 && num%5==0 ) {
//			System.out.println("3과5의 배수입니다");
//		}
//		
//		if(num%3==0) {
//			if(num%5==0) {
//				System.out.print("3과5의 배수입니다");
//			}
//		}

//		System.out.println("====에버랜드에 오신 걸 환영합니다!====");
//		System.out.print("나이를 입력 : ");
//		int age = sc.nextInt();
//		System.out.print("인원수 : ");
//		int people = sc.nextInt();
//		int money = 0;
//		if(age<20 ) {
//			 money = (int) (people*5000*0.5);
//			 
//		}else {
//			money = people*5000;
//		}
//		System.out.print("총" +money+"원입니다." );

//		System.out.print("상품개수 : " );
//		int num = sc.nextInt();
//		int money = 0;
//		if(num>=11) {
//			money = (int) (num*10000*0.9);
//		}else {
//			money = num*10000;
//		}
//		System.out.print("가격은" + money  + "원입니다." );

//		System.out.print("숫자입력 : " );
//		double num = sc.nextInt();
//		String a ="";
//		if(num==0){
//			a="0";
//			//System.out.print("숫자입력 : " );
//		}else if(num%2==1) {
//			a="홀수";
//			//System.out.print("숫자입력 : " );
//		}else {
//			a="짝수";
//			//System.out.print("숫자입력 : " );
//		}
//		System.out.print(a);

//		System.out.print("숫자입력 : " );
//		int totalScore = sc.nextInt();
//		String a ="";
//		if (totalScore>=90) {
//			a="A";
//		}else if(totalScore>=80) {
//			a="B";
//		}else if(totalScore>=70) {
//			a="C";
//		}else {
//			a="D";
//		}
//		System.out.print(a);

//		System.out.print("점수입력 : ");
//		int Score = sc.nextInt();
//		char a ='A';	
//		switch (Score/10) {
//		case 10 :
//			a ='ㅠ';
//		case 9 : 
//			a ='A';
//			break;
//		case 8:
//			a ='B';
//			break;
//		case 7:	
//			a ='C';
//			break;
//		default:
//			a ='D';
//			break;
//		}
//		System.out.print(a+"학점");

//		System.out.println("금액입력 : ");
//		int money = sc.nextInt();
//		System.out.println("메뉴선택");
//		System.out.print("1.아우터(700원) 2.이구동성(1000원) 3.에그몽(500원) >> ");
//		int menu = sc.nextInt();
//		int change = money;
//		if (menu == 1) {
//			if (money >= 700) {
//				change = money - 700;
//			} else {
//				System.out.println("부족함");
//			}
//		} else if (menu == 2) {
//			if (money >= 1000) {
//				change = money - 1000;
//			} else {
//				System.out.println("부족함");
//			}
//		} else if (menu == 3) {
//			if (money >= 500) {
//				change = money - 500;
//			} else {
//				System.out.println("부족함");
//			}
//		} else {
//			System.out.println("재선택");
//		}
//		System.out.println("잔돈 : " + change + "원");
//		System.out.print("천원 : " + change/1000 + "개, ");
//		System.out.print("오백원 : " + change%1000/500 + "개, ");
//		System.out.print("백원 : " + change%1000%500/100 + "개");

//		int a =2;
//		  a+=2;
//		  a--;
//		System.out.println(a);

//		int num = 0;
//		while (num<5) {
//			num++;
//			System.out.println("ddd");
//			//num += 1;
//			//num++;
//		}

//		int num =0;
//		while (num <10) {
//			System.out.print("정수입력 : ");
//			num = sc.nextInt();
//		}
//		System.out.println("종료");

		// int num = 0;
//		while (true) {
//			System.out.print("정수입력 : ");
//			int num = sc.nextInt();
//			if (num >= 10) {
//				System.out.println("종료");
//				break;
//			}
//		}
//		int a =0;
//		while (true) {
//			System.out.print("정수입력 : ");
//			int num = sc.nextInt();
//			//a = a+num;
//			a+=num;
//			System.out.println("누적결과 : " + a );
//			if (num==-1) {
//				
//				System.out.println("종료");
//				break;
//			}
//			
//		}
//		int sum =0;
//		int sum2 =0;
//		while (true) {
//			System.out.print("숫자입력 : ");
//			int num = sc.nextInt();
//			if (num % 2 == 0) {
//				sum++;
//			} else if (num % 2 == 1) {
//				sum2++; 
//			} else if (num == -1) {
//				System.out.println("종료");
//				break;
//			}
//			System.out.println("짝수개수 : "+sum);
//			System.out.println("홀수개수 : "+sum2);
//		}

//		do {
//			System.out.println("홀수개수 : ");
//		}while (false);

//		System.out.print("현재 몸무게 : ");
//		int num = sc.nextInt();
//		System.out.print("목표 몸무게 : ");
//		int num2 = sc.nextInt();
//
//		int num3 = 0;
//		//int num4 = 0;
//		do {
//			num3++;
//
//			System.out.print(num3 + "주차 감량 몸무게 : ");
//			int kg = sc.nextInt();
//		//	num4 += kg;
//		//	num=num-kg;
//			num -= kg;
//			if (num <= num2) {
//				System.out.println(num + "kg달성!! 축하축하!!");
//				break;
//			}
//		} while (true);

		// 1.입력도구 꺼내기
		// Scanner sc = new Scanner(System.in);
		// 2.랜덤숫자 추출도구 꺼내기
		Random ran = new Random();
		do {
			int ranNum1 = ran.nextInt(9) + 1; // +1을 주어 1부터~9까지 랜덤
			int ranNum2 = ran.nextInt(9) + 1;
			// 3.문제출력
			System.out.print(ranNum1 + "+" + ranNum2 + "=");
			// 4.사용자로부터 정답 입력받기
			int input = sc.nextInt();
			// 5.입력받은 숫자와 정답이 같은지 비교
			if (input == ranNum1 + ranNum2) {
				System.out.println("성공!");
			} else {
				
					// 5-1 정답이 미일치시 계속하시겠습니까? 출력
					System.out.println("실패...");
					System.out.print("계속하시겠습니까?>> ");
					String answer = sc.next();
					// 5-2 N을 입력받으면 게임종료 // N이 아닌 어떤 다른 문자를 적으면 계속 됨
					// 문자열 비교개념

					if (answer.equals("N")) { // ==은 기본자료형에서만 사용가능 String은 기본아님 .equals("") 명령어(구문) 사용함
						System.out.print("종료합니다. ");
						break;
					} else if (answer.equals("Y")) {
                        
					}
				}
			

		} while (true);

	}

}
