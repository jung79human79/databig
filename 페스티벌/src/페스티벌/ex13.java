package 페스티벌;

import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("단수 입력 : ");
		int num1 = sc.nextInt();
		System.out.println("어느 수까지 출력 : ");
		int num2 = sc.nextInt();
		System.out.println(num1+"단");
		for (int i = 1; i <= num2; i++) {
			System.out.println(num1+"*"+i+"="+num1*i);
		}
	}

}
