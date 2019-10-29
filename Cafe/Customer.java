package com.jh.cafe;

import java.util.Scanner;

public class Customer {
	private Scanner scan = new Scanner(System.in);

	public MenuItem order(MenuTable mt) {
//		MenuItem result = null;

		mt.showCoffee();
		System.out.println("메뉴를 선택해 주세요!(1~4번): ");
		int selectedIdx = scan.nextInt();
		return mt.choiceMenu(selectedIdx);
	}
}
