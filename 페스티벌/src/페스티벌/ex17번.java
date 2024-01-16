package 페스티벌;

public class ex17번 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			
			for (int j = 0; j < 5-i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
