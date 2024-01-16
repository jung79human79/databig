package 페스티벌;

import java.util.Random;

public class ex18번 {

	public static void main(String[] args) {

		int[] array = new int[8];
		Random ran = new Random();
		for (int i = 0; i < array.length; i++) {
		    array[i]= ran.nextInt(99)+1;
		    
		}
		System.out.print("배열에 있는 모든 값 : ");
		
		int max=array[0];
		int min=array[0];
		//System.out.println(array[0]);
		for (int i = 0; i < array.length; i++) {
			System.out.print(" " +array[i]);
			if(max<array[i]) {
				max=array[i];
			}else if(min>array[i]) {
				min=array[i];
			}
		}
		System.out.println("\n가장 큰 값 : "+max);
		System.out.println("가장 작은 값 : "+min);
	}

}
