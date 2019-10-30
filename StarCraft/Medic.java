package com.jh.sc;

public class Medic extends Unit implements Healable {
	Medic() {
		max_hp = 60;
		hp = max_hp;
		movingSpeed = 1;
	}
	
	@Override
	public String toString() {
		return "Medic " + super.toString();
	}
	
	public void heal(Unit unit) {		
		if(unit instanceof Healable) {
			//1씩 치료		
			while(unit.max_hp > unit.hp) {
				unit.hp++;
			}
			System.out.println("치료 완료!");
		} else {
			System.out.println("치료할 수 없습니다.");
		}			
	}
}