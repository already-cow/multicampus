package chapter07.sec07;

public class SingletonEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();

		System.out.println(obj1);
		System.out.println(obj2);

		if (obj1 == obj2) {
			System.out.println("같은 Singleton 객체입니다.");
		} else {
			System.out.println("다른 Singleton 객체입니다.");
		}

		obj1.open();
		obj2.read();
		obj1.close();
	}
}
