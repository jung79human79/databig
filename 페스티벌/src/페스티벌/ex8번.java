package 페스티벌;


public class ex8번 {

	public static void main(String[] args) {

		int sum =0;
		for (int i = 1; i <=100; i++) {
			if(i%2==0) {
				System.out.print(i*-1+" ");
				sum=sum-i;    //sum += i*-1;   //sum=sum-i;
				
			}else {
				System.out.print(i+" ");
				sum += i;
			}	
		}
		System.out.println("\n결과 : "+sum);
		
		//팀장방법
//		int sum = 0;
//		for(int i = 1; i<=100 ; i++) {
//			//삼항연사자를 이용해 홀수일 경우 1, 짝수일 경우 -1을 곱해서 계산
//			int result = (i % 2 == 1)? 1: -1;
//			sum += i * result;
//			System.out.print((i * result) + " ");
//		}
//		System.out.print("\n결과 :" + sum);
	}

}
