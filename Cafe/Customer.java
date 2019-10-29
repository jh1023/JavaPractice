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

	public void makeCoffee() {

	}

	public void drink(Coffee coffee) {
		if (coffee == null) {
			System.out.println("커피를 마실 수 없습니다.");
			return;
		} else {
			System.out.printf("%s을(를) 마신다.\n", coffee.getName());
		}

	}
}
