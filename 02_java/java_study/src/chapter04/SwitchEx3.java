package chapter04;

import java.util.Scanner;

public class SwitchEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("저녁에 먹을 음식 종류 짜장면, 우동, 라면 >> ");
		String food = sc.next();

		switch (food) {
		case "짜장면":
			System.out.println("중국집으로 가요!");
			break;

		case "우동":
			System.out.println("일식집으로 가요!");
			break;

		case "라면":
			System.out.println("분식집으로 가요!");
			break;

		default: // if 문의 else 기능
			System.out.println("집에서 먹어요!");
			break;
		}
	}

}
