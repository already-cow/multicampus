package chapter04;

import java.util.Date;

public class SwitchEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		int month = date.getMonth() + 1;
		int day = date.getDay(); // 일요일 0부터 시작
		System.out.println(day);
		switch (day) {
		case 0: // 일
		case 6: // 토
			System.out.println("자바공부하러가");
			break;

		default:
			break;
		}

		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;

		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;

		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;

		case 12:
		case 1:
		case 2:
			System.out.println("겨울");
			break;

		default:
			break;
		}

	}

}
