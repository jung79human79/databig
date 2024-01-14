package 페스티벌;

public class ex10번 {

	public static void main(String[] args) {

		for(int i = 65; i<=90; i++) { 
			//char는 문자 타입 --> 숫자를 문자로 변환하기위해 (char)를 이용하여 형 변환
			char ch = (char)i;
			System.out.print(ch + " ");
		}
		System.out.println();
		
		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.print(i+" ");
		}
		
		
	}

}
