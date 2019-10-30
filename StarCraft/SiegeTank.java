package com.jh.sc;

public class SiegeTank extends AttackUnit {
	boolean siegeMode;
	int sigePowerOfAttack;

	SiegeTank() {
		max_hp = 150;
		hp = max_hp;
		movingSpeed = 1;
		powerOfAttack = 30;
	}

	void changeMode() {
	
/*		if (siegeMode == false) {
			siegeMode = true;
			powerOfAttack=powerOfAttack+10;

		} else {
			siegeMode = false;
			

		}*/
		siegeMode = !siegeMode;

	}

	@Override
	public String toString() {
		return "siegeMode : " + siegeMode;

	}
	@Override
	void attack(Unit unit) {
		if(siegeMode) {
			unit.hp -= sigePowerOfAttack;
		}else {
			super.attack(unit);
		}
		
	}

}
