package chapter07.sec01;

public class AccountUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account(); // string 타입은 null int 타입은 0
		System.out.println(a1);

		Account a2 = new Account("홍길동", "일반예금", 10000); // 두번째 생성자
		System.out.println(a2);
	}

}
