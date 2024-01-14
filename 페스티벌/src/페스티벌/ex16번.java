package 페스티벌;

import java.util.Scanner;

public class ex16번 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수 : ");
		int line = sc.nextInt();
		for (int i =line ; i>0 ; i--) {
			for (int j = 0; j <i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
