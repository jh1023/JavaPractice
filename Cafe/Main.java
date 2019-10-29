package com.jh.cafe;

public class Main {
	public static void main(String[] args) {
		MenuTable mt = new MenuTable();
		mt.showCoffee();
		Customer ct = new Customer();
		Baristar br = new Baristar();

		MenuItem mi = ct.order(mt);
		if (mi != null) {
			System.out.println("주문한 커피 : " + mi.getMenuName() + "  가격 :" + mi.getMenuPrice() + "원");
			Coffee coffee = br.makeCoffee(mi);
			ct.drink(coffee);
		}
		System.out.println("종료");

	}

}
