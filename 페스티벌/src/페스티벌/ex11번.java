package 페스티벌;

import java.util.Scanner;

public class ex11번 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("n 입력 : ");
		int num = sc.nextInt();
		int sum = 1;
		
		for (int i = 1; i <= num; i++) {
			
			//sum = sum+ i;
			System.out.print(sum+" ");
			sum = sum+ i;
		}
		
	}

}
