package 인터페이스;

public class Main {

	public static void main(String[] args) {

		// 실행화면
		// 인터페이스 객체 생성이 가능할까?
		// --> 익명의 내부 자료형태(안드로이드에 많이 사용)로는
		//     객체생성이 가능하다
		// --> 일반적인 형태로 객체생성은 불가능하다.
		Temp t = new Temp() {
			
			@Override
			public void temp() {
				
			}
			
		};
	}			
}
