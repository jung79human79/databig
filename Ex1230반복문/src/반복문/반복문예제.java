package 반복문;

import java.util.Scanner;

public class 반복문예제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1 = 0;                                  //짝수변수
		int num2 = 0;                                  //홀수변수
		while(true) {
			System.out.print("정수입력: ");
			int num = sc.nextInt();
			if(num%2==0) {
				num1++;	                                      //1씩 누적 증가
			//System.out.println("짝수개수: "+num1);	
			//System.out.println("홀수개수: "+num2);
			}else if(num%2 ==1) {                                 // num%2 !=0 으로 주면 안됨
  			    num2++;
  			//System.out.println("짝수개수: "+ num1);
			//System.out.println("홀수개수: "+ num2);
	        }else if (num ==-1 ) {
				System.out.println("종료되었습니다.");
				break;
		 }
			System.out.println("짝수개수: "+num1);
			System.out.println("홀수개수: "+num2);
		}
	}

}
