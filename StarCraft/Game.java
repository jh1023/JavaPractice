package com.jh.sc;

public class Game {

	public static void main(String[] args) {

		Marine m1 = new Marine();
		FireBat f1 = new FireBat();
		Medic d1 = new Medic();
		SiegeTank siege = new SiegeTank();
		Barrack brrack = new Barrack();
		Unit u = brrack.makeUnit(2);
		

		System.out.println(u);
		// System.out.println(m1);
		// System.out.println(d1);

//		m1.attack(f1);
//		System.out.println(f1);
//		d1.heal(f1);
//		System.out.println(f1);
		
		
		
		Building b = new Barrack();
		b.landing();
		
		b = new Academy();
		b.landing();




		

	}
}