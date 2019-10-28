package com.jh.vmv1;

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

	}

	public void purchase(int idx, int money) {
		//해당제품의 주소값을 빼온 다음에
		//money값과 제품의 price 값을 비교
		//금액이 부족하면 "금액이 부족합니다."
		//else 잔돈을 나타낸다
		//idx값이 마이너스 값이거나 outofArrayIndex 에러가 나지 않도록
		
		if(money < idx) {
			System.out.println("금액이 부족합니다.");
		}
		else {
			System.out.println("잔액입니다."+(money-idx));
		}
		
	}
	
	
	public void showDrinks() {
		int i;
		for (i = 0; i < drinks.size(); i++) {
			Drink d = drinks.get(i);
			System.out.printf("%d  %s(%, d원)\n", (i + 1), d.getpName(), d.getPrice());
		}
		
		System.out.println("----------------------");
		
		int y = 1;
		for (Drink d : drinks) {
			System.out.printf("%d.%s\n", y++, d);
		}
		System.out.println("----------------------");

		int z=1;
		for(Drink d: drinks) {
			System.out.printf("%d  %s(%, d원)\n", z++, d.getpName(), d.getPrice());
		}
		
		

		
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
