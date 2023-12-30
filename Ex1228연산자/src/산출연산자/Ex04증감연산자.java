package 산출연산자;

public class Ex04증감연산자 {

	public static void main(String[] args) {
		int num = 4;
		//증감연산자 --> 위치에 따라서 증감되는 순서가 변동
		// ++변수 >> 1증가 시키고 >> 변수사용(다음줄로 넘어가면 사용완료 된것임)
		// 변수++ >> 변수 사용 다음에 >> 1증가 
		System.out.println(++num);
		System.out.println(num);
		System.out.println(num++);
		System.out.println(num);
	}

}
