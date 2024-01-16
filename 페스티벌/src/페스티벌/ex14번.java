package 페스티벌;

import java.util.Scanner;

public class ex14번 {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.print("입력 : ");
		int num = sc.nextInt();
		int num2=1;
		for (int i = 1; i <=num; i++) {
			num2*=i;
		}
		System.out.print("출력 : "+num2 );
	}
}
