package com.jh.cafe;

public class Coffee {
	private String name;

	/*
	 * 생성자 기본x MenuItem객체 주소값을 받는 생성자 MenuItem에 들어있는 메뉴명값을 name에 복사해주는 기능이 있는 생성자
	 */

	public Coffee(MenuItem mi) {
		name = mi.getMenuName();

	}

	public String getName() {
		return name;
	}

}
