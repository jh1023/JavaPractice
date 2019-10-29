package com.jh.cafe;

import java.util.*;

public class MenuTable {

	private List<MenuItem> menus; // MenuItem 클래스

	public MenuTable() {
		menus = new ArrayList();
		menus.add(new MenuItem("아메리카노", 1500));
		menus.add(new MenuItem("카푸치노", 2000));
		menus.add(new MenuItem("카라멜마키야또", 2500));
		menus.add(new MenuItem("에스프레소", 2500));
	}

	public void showCoffee() {
		int i;
		System.out.println("---------메뉴판----------");

		for (i = 0; i < menus.size(); i++) {
			MenuItem c = menus.get(i);
			System.out.printf("%d.  %s - (%, d원 )\n", (i + 1), c.getMenuName(), c.getMenuPrice());
		} // %, d원 천단위 콤마 찍어줌.

		System.out.println("------------------------");
	}

	// 메뉴선택
	public MenuItem choiceMenu(int idx) {
		int targetIdx = idx - 1;
		if (targetIdx < 0 || targetIdx >= menus.size()) {
			System.out.println("에러가 발생했습니다.");
			return null;
		}

		return menus.get(idx - 1); // 메뉴가 1번부터 시작하기 때문에 1을 빼서 0번째 값을 가져올수 있게한다

	}
}
