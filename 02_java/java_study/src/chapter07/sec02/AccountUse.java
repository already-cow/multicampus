package chapter07.sec02;

public class AccountUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account("홍길동", "990114", 10000);
		System.out.println(a1);

		Account a2 = new Account("고길동", "990114", 10000);
		System.out.println(a2);

		System.out.println(a2.getmoney());

	}

}
