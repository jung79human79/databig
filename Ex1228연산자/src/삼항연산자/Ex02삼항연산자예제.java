package 삼항연산자;

import java.util.Scanner;

public class Ex02삼항연산자예제 {

	public static void main(String[] args) {
        //입력도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		//정수를 입력해 주세요 출력하기 (개행없이)
		System.out.print("정수를 입력해 주세요>> ");
		//정수 입력받기
		int num = sc.nextInt();
		//입략받은 정수가 홀수인지 짝수인지 확인하기
		String result = num%2 ==1 ? "홀수" : "짝수";
		//결과 출력하기
		System.out.println(num + "은(는)" + result + "입니다.");
	}
}
