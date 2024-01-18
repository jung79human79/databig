package 페스티벌;

public class 클래스연습 {

	private String empno;
	private String name;
	private int pay;
	
	public 클래스연습 (String empno, String name, int pay) {
		this.empno = empno;
	//this.name = name;
		//this.pay = pay;
	}
	
	public int getMoneyPay() {                

		return pay / 12;                   

	}
	
	public String print() {

		return empno + " * " + name + " * " + pay;

	}

	public String getEmpno() {
		return empno;
	}

	public void setEmpno(String empno) {
		this.empno = empno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

}
