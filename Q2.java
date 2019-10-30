package com.jh.test;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		// 콘솔로부터 1~12사이의 값을 입력받아서 결과를 출력하는 프로그램
		// 3~5사이의 숫자면 "봄"
		// 6~8 "여름"
		// 9~11 "가을"
		// 12,1,2 "겨울"
		// 이외의 숫자면 "잘못입력:
		// switch해결

		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요(1~12)");
		int season = scan.nextInt();

		switch (season) {
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
		case 1:
		case 2:
		case 12:
			System.out.println("겨울");
			break;
		default:
			System.out.println("잘못입력");

		}

	}

}
