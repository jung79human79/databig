package 페스티벌;

import java.util.Scanner;

public class ex5번 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("현재 몸무게 : ");
		int kg = sc.nextInt();
		System.out.print("목표 몸무게 : ");
		int goal = sc.nextInt();
		int week = 0;
		do {
			week++;
			System.out.print(week + "주차 몸무게 : ");
			int kg2 = sc.nextInt();
			kg = kg-kg2;
			if(kg <= goal) {
				System.out.print(kg + "kg달성!! 축하합니다.");
				break;
			}

		} while (true);

	}

}
