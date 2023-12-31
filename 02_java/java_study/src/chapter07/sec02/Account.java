package chapter07.sec02;

public class Account { // 지역변수 : 갈색 멤버변수 : 파란색
	private String name;
	private String ssn;
	private int money;

	public Account(String name, String ssn, int money) {
		this.name = name;
		this.ssn = ssn;
		this.money = money;
	}

	// Generate Constructor using field...
//	public Account(String name, String ssn, int money) {
//		super();
//		this.name = name;
//		this.ssn = ssn;
//		this.money = money;
//	}

	public Account(String name, String ssn) {
		super();
		this.name = name;
		this.ssn = ssn;
	}

	public int getmoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	// Generate to String() ..
	@Override
	public String toString() {
		return "Account [name=" + name + ", ssn=" + ssn + ", money=" + money + "]";
	}

}
