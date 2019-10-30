package com.jh.sc;

public class Academy extends Building {

	@Override
	void depart() {
		System.out.println("이륙할수 없습니다.");
	}

	@Override
	void landing() {
		System.out.println("착륙할수 없습니다.");
	}

}
