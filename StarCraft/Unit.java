package com.jh.sc;

public class Unit {
	int max_hp;
	int hp;
	int movingSpeed;

	int x; // 유닛의 좌표값
	int y;

	public void moving(Coordinates s) {

	}

	@Override

	public String toString() {
		return String.format("max_hp: %d, hp: %d, ms:%d 좌표: x:%d, y:%d", max_hp, hp, movingSpeed, x, y);

	}
}
