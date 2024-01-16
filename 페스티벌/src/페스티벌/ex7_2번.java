package 페스티벌;

import java.util.Random;
import java.util.Scanner;

public class ex7_2번 {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		Random ran = new Random();
		int num =0;
		do {
			int ran1 = ran.nextInt(10);
			int ran2 = ran.nextInt(10);
			System.out.print(ran1+"+"+ran2+"=" );
			int input = sc.nextInt();
			if(ran1+ran2==input) {
				System.out.println("SUCCESS!!" );
				
			}else{
				num++;
				System.out.println("Fail..." );
				if(num==5) {
					System.out.println("게임종료" );
					break;
				}
			}
			
			
			
			
			
		}while(true);
	}

}
