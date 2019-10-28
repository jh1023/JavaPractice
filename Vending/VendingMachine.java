package com.jh.vmv1;

import java.util.*;

public class VendingMachine {

	private List<Drink> drinks;

	public VendingMachine() {
		drinks = new ArrayList();

		drinks.add(new Drink("콜라", 1000));
		drinks.add(new Drink("사이다", 1100));
		drinks.add(new Drink("환타", 1200));
		drinks.add(new Drink("2%", 1300));
		drinks.add(new Drink("마운틴듀", 1400));

	}

	public void showDrinks() {
		int i;
		for (i = 0; i < drinks.size(); i++) {
			Drink d = drinks.get(i);
			System.out.printf("%d  %s(%, d원)",(i+1), d.getpName(),d.getPrice());
			
		}

	}
}

/*
 * //넣는거 list.add(1); list.add("dd"); list.add(true); list.add("사이다",1000);
 * 
 * 
 * //빼는거 list.get(0); list.get(1); list.get(2);
 * 
 * //크기 list.size();
 */