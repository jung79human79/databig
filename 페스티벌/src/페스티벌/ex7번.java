package 페스티벌;

import java.util.Random;
import java.util.Scanner;

public class ex7번 {

	public static void main(String[] args) {


		      Scanner sc = new Scanner(System.in);
		      Random ran = new Random();

		      do {
		         int ranNum1 = ran.nextInt(9) + 1; 
		         int ranNum2 = ran.nextInt(9) + 1;

		         System.out.print(ranNum1 + "+" + ranNum2 + "=");
		         int input = sc.nextInt();

		         if (input == ranNum1 + ranNum2) {
		            System.out.println("성공!");
		         } else {
		            System.out.println("실패...");
		            while (true) {
		               System.out.print("계속하시겠습니까?>> ");
		               String answer = sc.next();
		               if (answer.equalsIgnoreCase("N")) {   // 대소문자 구분 없이 동일 여부 체크 //즉 answer와 N을 비교
		                  System.out.print("종료합니다. ");
		                  return; // 프로그램 종료
		               } else if (answer.equalsIgnoreCase("Y")) {
		                  break; // 다음 문제로 진행
		               } else {
		                  System.out.println("다시 선택해주세요!");
		               }
		            }
		         }

		      } while (true);
	
	
	}
	
		
	}


