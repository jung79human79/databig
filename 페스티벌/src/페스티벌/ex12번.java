package 페스티벌;

import java.util.Scanner;

public class ex12번 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		int sum =0;
		int a=0;
		int b=0;
		int c=0;
		int d=0;
		int e=0;
		int f=0;
		int g=0;
		int h=0;
		for (int i = 10000000; i >= 1; i/=10) {
            int digit = (num / i) % 10; 
            sum += digit;
            if(i == 10000000) {
            	 a = (num / i) % 10;
            }else if(i == 1000000) {
            	 b = (num / i) % 10;
            }else if(i == 100000) {
            	 c = (num / i) % 10;
            }else if(i == 10000) {
            	 d = (num / i) % 10;
            }else if(i == 1000) {
            	 e = (num / i) % 10;
            }else if(i == 100) {
            	 f = (num / i) % 10;
            }else if(i == 10) {
            	 g = (num / i) % 10;
            }else if(i == 1) {
           	     h = (num / i) % 10;
           }
        }
		System.out.println("합은 " + sum  + "입니다.");
		System.out.print(num+ "=>"+a+"+"+b+"+"+c+"+"+d+"+"+e+"+"+f+"+"+g+"+"+h);
	}

}
