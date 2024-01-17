package 페스티벌;

import java.util.Scanner;

public class ex26_2번 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기를 정할 정수 N 입력 : ");
		int n = sc.nextInt();

		// 배열 크기 선언 및 증가할 값 num 초기화
		int[][] array = new int[n][n];
		int num = 1;

		// 입력

		for (int j = 0; j < array.length; j++) {
			// j가 0 혹은 짝수일 경우 배열이 순차적으로 증가하며 값을 넣음
			if (j % 2 == 0) {
				for (int i = 0; i < array.length; i++) {
					array[j][i] = num++; // j행,i열
				}
				// j가 홀수일 경우 배열이 감소하며 값을 넣음	
			} else {
				for (int i = 4; i >= 0; i--) {
					array[j][i] = num++;
				}
			}

		}

		// 출력

		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[j][i] + "\t");
			}
			System.out.println();
		}

	}

}
