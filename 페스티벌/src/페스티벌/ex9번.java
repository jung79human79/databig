package 페스티벌;

public class ex9번 {

	public static void main(String[] args) {

		int sum = 0;
		for (int i = 1; i <= 77; i++) {
			sum += i * (78-i);
		}
	
		System.out.println(sum);
	}

}
