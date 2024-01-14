package 페스티벌;

import java.util.Scanner;

public class ex19번 {

	public static void main(String[] args) {

		int[] array = new int[10];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < array.length; i++) {
			System.out.print((i + 1) + "번째 정수 입력 : ");
			array[i] = sc.nextInt();
		}
		System.out.print("3의 배수 : ");
		for (int i = 0; i < array.length; i++) {
			
			if (array[i] % 3 == 0) {
				System.out.print(array[i]+" ");
			}
		}
	}

}
