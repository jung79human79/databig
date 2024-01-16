package 페스티벌;

import java.util.Scanner;

public class ex5번 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("현재 몸무게 : ");
		int now = sc.nextInt();
		System.out.print("목표 몸무게 : ");
		int goal = sc.nextInt();
		int week =0;
		int num2= 0;
		do {
			week++;
			System.out.print(week+"주차 감량몸무게 : ");
			int num = sc.nextInt();
			num2 += num;
			if(now-num2<= goal) {
				break;
			}
		}while(true);
		
		System.out.println(now-num2+"kg달성!! 축하합니다!!");
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("현재 몸무게 : ");
//		int kg = sc.nextInt();
//		System.out.print("목표 몸무게 : ");
//		int goal = sc.nextInt();
//		int week = 0;
//		do {
//			week++;
//			System.out.print(week + "주차 몸무게 : ");
//			int kg2 = sc.nextInt();
//			kg = kg-kg2;
//			if(kg <= goal) {
//				System.out.print(kg + "kg달성!! 축하합니다.");
//				break;
//			}
//
//		} while (true);

}
}
