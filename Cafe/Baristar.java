package com.jh.cafe;

public class Baristar {

	public Coffee makeCoffee(MenuItem mi) { // 다형성
		switch (mi.getMenuName()) {
		case "아메리카노":
			return new Americano(mi);
		case "카푸치노":
			return new Cappuccino(mi);
		case "카라멜마키야또":
			return new CaramelMakkiaTto(mi);
		case "에스프레소":
			return new Espresso(mi);
		default:
			return null;

		}

	}

}
