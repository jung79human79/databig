package 삼항연산자;

import java.util.Scanner;

public class Ex03농구공예제 {

	public static void main(String[] args) {
		//입력도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		//농구공의 갯수를 입력하세요 출력하기 (개행없이)
		System.out.print("농구공의 갯수를 입력하세요>> ");
		//농구공의 갯수 데이터 입력받기
		int ball = sc.nextInt();
		//필요한 상자의 수 구하기(삼항연산자사용)=수식으로 풀어서 쏘보기!!
		// 볼이 33이라면 한박스에 5개만 들어가는 박스가 몇개 필요하나?
		int result = ball%5 == 0 ? ball/5 : ball/5+1;  
		//결과 출력하기
		System.out.println("필요한 상자의 수: " + result);	
	}
}
