package 로또번호;

import java.util.Arrays;
import java.util.Random;

public class ex로또번호 {

	public static void main(String[] args) {

		Random ran = new Random();
		int[] lotto = new int[10];

		for (int j = 0; j < lotto.length; j++) {
			lotto[j] = ran.nextInt(10) + 1;
			for (int i = 0; i < j; i++) {
				if (lotto[i] == lotto[j]) {
				  //lotto[j] = ran.nextInt(10) + 1;    // 생략가능
					j--;
					break;    // 멈추고 맨 위 for문으로~
				}
			}
		}
		System.out.println(Arrays.toString(lotto));
		System.out.println("\n");
		System.out.println("정대주\n");
		System.out.print("zzz");
		System.out.println("zzz");
		

//		lotto[2] = ran.nextInt(10) + 1;
//		for (int i = 0; i < 2; i++) {
//			if (lotto[i] == lotto[2]) {
//
//				lotto[2] = ran.nextInt(10) + 1;
//			}
//		}
//
//		lotto[3] = ran.nextInt(10) + 1;
//		for (int i = 0; i < 3; i++) {
//			if (lotto[i] == lotto[3]) {
//				lotto[3] = ran.nextInt(10) + 1;
//			}
//		}
//
//		lotto[4] = ran.nextInt(10) + 1;
//		for (int i = 0; i < 4; i++) {
//			if (lotto[i] == lotto[4]) {
//				lotto[4] = ran.nextInt(10) + 1;
//			}
//		}


		



	}

}



