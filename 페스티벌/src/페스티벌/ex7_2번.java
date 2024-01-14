package 페스티벌;

import java.util.Random;
import java.util.Scanner;

public class ex7_2번 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		int fail = 0;
		do {
			int num1 = ran.nextInt(10) + 1;
			int num2 = ran.nextInt(10) + 1;
			System.out.print(num1 + "+" + num2 + "=");
			int input = sc.nextInt();
			if (num1 + num2 == input) {
				System.out.println("성공!");
			} else {
				// fail++;
				System.out.println("실패...");
				fail++;
				if (fail == 5) {
					System.out.println("게임 종료");
					break;
				}
			}
		} while (true);
	}

}
