package com.jh.sc;

public class Barrack extends Building {

	Unit makeUnit(int no) {
		switch (no) {
		case 1:
			return new Marine();
		case 2:
			return new FireBat();
		case 3:
			return new Medic();
		default:
			return null;
		}
	}

	@Override
	void depart() {
		System.out.println("이륙할 수 있습니다.");

	}

	@Override
	void landing() {
		System.out.println("착륙할 수 있습니다.");

	}

}
