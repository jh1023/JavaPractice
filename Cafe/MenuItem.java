package com.jh.cafe;

public class MenuItem {
	private static int count;
	private final String menuName; // 메뉴명 //은닉화
	private final int menuPrice; // 가격

	public MenuItem(String menuName, int menuPrice) { // 생성자
		this.menuName = menuName;
		this.menuPrice = menuPrice;

	}

	public static void showCount() { // 멤버필드값에 사용불가 ex)private final String menuName
		System.out.println("count:" + count);
	}

	public String getMenuName() { // 내가 외부로 줘야하는 값.
		return menuName;
	}

	public int getMenuPrice() {
		return menuPrice;
	}

}
