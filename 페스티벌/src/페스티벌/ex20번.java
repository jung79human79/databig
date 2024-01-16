package 페스티벌;

import java.util.Arrays;
import java.util.Random;

public class ex20번 {

	public static void main(String[] args) {

	int[] arr = new int[6];
	Random ran = new Random();
	
	for (int i = 0; i < arr.length; i++) {
		arr[i]=ran.nextInt(49)+1;
		for (int j = 0; j < i; j++) {
			if(arr[j]== arr[i]) {
				i--;
				break;
			}
		}
		//System.out.println("행운의 숫자 : " + arr[i]);
	}
		//System.out.println(Arrays.toString(arr));
	    //System.out.println("행운의 숫자 : " + arr[i]);
	for(int i =0; i<arr.length; i++) {
		System.out.println("행운의 숫자 : " + arr[i]);
	}
	}
}
