package chapter04;

import java.util.Scanner;

public class ForEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int m = 2; m < 9; m++) {
			System.out.println("***" + m + "단***");
			for (int n = 1; n <= 9; n++) {
				System.out.printf("%d x %d = %d\n", m, n, (m * n));
			}
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.>> ");
		int num = sc.nextInt();

		for (int x = 1; x < num; x++) {
			for (int y = 0; y < x; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
