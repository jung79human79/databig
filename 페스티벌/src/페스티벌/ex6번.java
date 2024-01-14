package 페스티벌;

import java.util.Scanner;

public class ex6번 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("a 입력 : ");
			int num = sc.nextInt();
			System.out.print("b 입력 : ");
			int num2 = sc.nextInt();
			if (num == 0 && num2 == 0) {
				break;
			}
			System.out.println("결과 : " + (num - num2));

		}

	}
}
