package 페스티벌;

import java.util.Arrays;
import java.util.Random;

public class ex20번 {

	public static void main(String[] args) {

		int[] arr = new int[6];
		Random ran = new Random();
	//	for (int i = 0; i < array.length; i++) {
	//		array[i]= ran.nextInt(49)+1;
	//		System.out.println("행운의 숫자 : " + array[i]);
	//	}
		
		
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = ran.nextInt(49)+1;
			for(int j = 0; j<i; j++) {
				if(arr[j] == arr[i]) {
					i--;
					break;
				}
			}
			//System.out.println("행운의 숫자 : " + arr[i]);  //에러= i--;때문에 중복될수 있음 
		}   // arr[1]이 arr[2]가 아니고 i--; 다시 arr[1]로 될수 있음
		    // if 문에 arr[j] == arr[i]가 같은 경우에 해당됨~
		
		System.out.println(Arrays.toString(arr));
		//System.out.println("행운의 숫자 : " + arr[i]);  //에러=변수에러
		for(int i = 0; i<arr.length; i++) {
		System.out.println("행운의 숫자 : " + arr[i]);
		}
	}

}
