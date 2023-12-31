package chapter07.sec04;

public class MyRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Tv.count); // 클래스명을 통해 접근

		Tv myTv = new Tv(7, 9, true);
		Tv yourTv = new Tv(9, 12, true);
		System.out.println(myTv);
		System.out.println(yourTv);

		Tv[] tvArr = new Tv[100];

		for (int i = 0; i < 100; i++) {
			Tv tv = new Tv(1, 1, true); // 지역변수
			tvArr[i] = tv;
			// tvArr[i] = new Tv(1, 1, true);
		}

		System.out.println(myTv.getChannel());
		System.out.println(yourTv.getChannel());
		System.out.println(tvArr[0]);

		int[] numbers = { 1, 2, 3 }; // primitive 데이터 타입

		Tv[] tvArrs = { new Tv(10, 10, false), new Tv(11, 10, true), new Tv(12, 10, false) }; // 참조형 데이터 타입

		System.out.println(Tv.count);
		System.out.println("myTv의 serial number: " + myTv.getSerial());

	}

}
