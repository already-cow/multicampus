package chapter04;

import java.util.Scanner;

public class ForEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 1; i < 100; i++) {
			if (i % 2 == 0) {
				sum = sum + i; // sum = sum + i

			}
		}
		System.out.println("1~100 까지의 합:" + sum);

		sum = 0;
		for (int i = 0; i < 100; i++) {
			if (i % 2 == 1) {
				sum = sum + i; // sum = sum + i

			}
		}
		System.out.println("1~100 까지의 합:" + sum);

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요. >> ");
		int num = sc.nextInt();

		sum = 0;
		for (int i = 0; i < num; i++) {
			if (i % 2 == 0) {
				sum = sum + i; // sum = sum + i

			}
		}
		System.out.println("1~100 까지의 합:" + sum);
	}
}
