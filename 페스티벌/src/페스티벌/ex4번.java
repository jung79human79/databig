package 페스티벌;

import java.util.Scanner;

public class ex4번 {

//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		System.out.print("첫번째 숫자입력 : ");
//		int num = sc.nextInt();
//		System.out.print("두번째 숫자입력 : ");
//		int num2 = sc.nextInt();
//		
//		System.out.println(num*(num2%100%10));   //  num2%10
//		System.out.println(num*(num2%100/10));
//		System.out.println(num*(num2/100));
//		System.out.println(num*num2);
		
		// 팀장
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("첫 번째 숫자 입력 >> ");
			int num1 = sc.nextInt();
			System.out.print("두 번째 숫자 입력 >> ");
			int num2 = sc.nextInt();
			int result1 = 0, result2 = 0, result3 = 0;
			
			if(num1 > 0 && num2 >0) {
				result1 = num1 * (num2%10);
				System.out.println(result1);
				result2 = num1 * (num2%100/10);
				System.out.println(result2);
				result3 = num1 * (num2/100);
				System.out.println(result3);
			}
			System.out.println(result1 + result2 *10 + result3 *100);
	}

}
