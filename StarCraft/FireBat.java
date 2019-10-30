package com.jh.sc;

public class FireBat extends AttackUnit implements Healable {
	// max_hp=50
	// hp=50
	// 공격력 8
	// 이동속도 1

	FireBat() {

		max_hp = 50;
		hp = max_hp;
		movingSpeed = 1;
		powerOfAttack = 8;
	}

	@Override
	public String toString() {
		return "FireBat " + super.toString();
	}


}
