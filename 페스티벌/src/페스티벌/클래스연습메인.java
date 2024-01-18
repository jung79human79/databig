package 페스티벌;

public class 클래스연습메인 {

	public static void main(String[] args) {

		클래스연습 c = new 클래스연습("1","2",36);
		
		System.out.println(c.getMoneyPay());
		System.out.println(c.getName());
		System.out.println(c.print());
		c.getMoneyPay();
		c.getName();
		c.print();
		c.setName("wjd");
		System.out.println(c.getName());
	}

}
