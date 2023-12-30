package if_else문;

import java.util.Scanner;

public class Ex01if_else문 {

	public static void main(String[] args) {
      //60점이상이면합격 이하면 불합격
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요>> ");
		int score = sc.nextInt();  //입력도구로 사용한 sc를 불러와 sc의 기능인 nextInt()을 사용
		if (score>=60) {
			System.out.print("합격");
		} else {
			System.out.print("불합격");
		}		
	}

}
