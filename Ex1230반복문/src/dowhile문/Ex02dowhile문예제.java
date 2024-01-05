package dowhile문;

import java.util.Scanner;

public class Ex02dowhile문예제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int week = 1;
		
		int num4 = 0;
		
		System.out.print("현재몸무게: ");
		int num1 = sc.nextInt();
		System.out.print("목표몸무게: ");
		int num2 = sc.nextInt();
		while (week<5) {
			System.out.print(week+"주차 감량몸무게: ");
			week++;
			int num3 = sc.nextInt();
			num4 += num3;  
		}
		do { 
			if (num1-num4 <= num2) {
				System.out.print((num1-num4)+"kg 달성!! 축하합니다!!");
				break;
			}else {
				System.out.print((num1-num4)+"kg 달성!!");
				break;
			}
				
		}while(true);
		
		//1.입력도구꺼내기
		//2.현재몸무게 입력받기
		//3.목표몸무게 입력받기
		//4.주차별 감량 몸무게 입력받기
		//--> 언제 다이어트 성공할지모름! 주차도 변수 선언하기
		//5-1. 현재몸무게=원래몸무게-감량몸무게(변수 더 만들필요 없음)
		//5-2. 현재몸무게가 목표몸무게에 도달했는지 조건을 판단
			
		
	}
	

}