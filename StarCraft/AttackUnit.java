package com.jh.sc;

public class AttackUnit extends Unit {
	int powerOfAttack;

	void attack(Unit unit) {
		unit.hp=unit.hp-powerOfAttack;
		
		
	}
	

	
	
	
	@Override

	public String toString() {
		String str = super.toString();
		return String.format("poa: %d, %s",  powerOfAttack, str);
	}

}
