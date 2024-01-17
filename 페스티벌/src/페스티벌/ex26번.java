package 페스티벌;

import java.util.Scanner;

public class ex26번 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크키를 정할 정수 N 입력 : ");
		int n = sc.nextInt();
		
		int[][] array = new int[n][n];
		int num = 1;
		
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array.length; i++) {
				array[j][i] = num++;
			}
		}
        // 데이터를 출력시 왼~오른
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[j][i] + "\t");      //역슬래시탭
			}
			System.out.println();              // 개행반복위치 확인필요 = 첫번째 for문 끝난 후 개행반복되므로 위의 for문안에 넣는다.
		}
	}

}
