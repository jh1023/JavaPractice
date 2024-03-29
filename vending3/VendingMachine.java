package com.jh.vmv3;

import java.util.*;

public class VendingMachine {

	private List<Drink> drinks;

	public VendingMachine() {
		drinks = new ArrayList();

		drinks.add(new Drink("콜라", 1000));
		drinks.add(new Drink("사이다", 1100));
		drinks.add(new Drink("환타", 1200));
		drinks.add(new Drink("2%", 1300));
		drinks.add(new Drink("마운틴듀", 1400));
		
		for(Drink d : drinks) {
			d.setStock(10);
		}

	}

	public void sales(int idx, Customer cust) {
		// 해당제품의 주소값을 빼온 다음에
		// money값과 제품의 price 값을 비교
		// 금액이 부족하면 "금액이 부족합니다."
		// else 잔돈을 나타낸다
		// idx값이 마이너스 값이거나 outofArrayIndex 에러가 나지 않도록
		// 재고가 없으면 메세지 "재고가 부족합니다."
		// 구매를 했다면 재고를 -1시킨다.
		int targetIdx = idx - 1;

		if (targetIdx < 0 || targetIdx >= drinks.size()) {
			System.out.println("에러발생");
			return;
		}
		Drink d = drinks.get(targetIdx);
		if (d.getPrice() > cust.getMoney()) {
			System.out.println("금액이 부족합니다.");
		} else {

			if (d.minusStock()) {
				int calc = cust.getMoney() - d.getPrice();
				System.out.printf("잔돈 : %,d\n", calc);
			} else {
				System.out.println("재고가 부족합니다.");
			}
		}
	}

	public void showDrinks() {
		System.out.println("-----------Menu-----------------"); //for문

		int i;
		for (i = 0; i < drinks.size(); i++) {
			Drink d = drinks.get(i);
			System.out.printf("%d  %s(%, d원) %d개\n", (i + 1), d.getPName(), d.getPrice(), d.getStock());
		}
/*
		System.out.println("------for each문----------------");

		int y = 1;
		for (Drink d : drinks) {
			System.out.printf("%d.%s\n", y++, d);
		}
		System.out.println("----------------------");

		int z = 1;
		for (Drink d : drinks) {
			System.out.printf("%d  %s(%, d원) %d개 \n", z++, d.getpName(), d.getPrice(), d.getStock());
		}
		System.out.println("----------------------");

		for (i = 0; i < drinks.size(); i++) {
			Drink d = drinks.get(i);
			System.out.printf("%d, %s\n", (i + 1), d);
		}
*/
	}

	// 파라미터 idx, 갯수

	public void putProduct(int idx, int qty) {
		// 1, 10 콜라의 stock값을 10으로 바꿔줌.
		int targetIdx = idx - 1;

		if (targetIdx < 0 || targetIdx >= drinks.size()) {
			System.out.println("에러발생!!!!!");
			return;
		}

		else if (qty < 0) {
			System.out.println("재고는 마이너스 값 불가");

			return;
		} else {
			System.out.println(qty + "개입니다.");
		}

		Drink d = drinks.get(idx - 1);
		d.setStock(qty);

	}
}

/*
 * //넣는거 list.add(1); list.add("dd"); list.add(true); list.add("사이다",1000);
 * 
 * 
 * //빼는거 list.get(0); list.get(1); list.get(2);
 * 
 * //크기 list.size();
 */