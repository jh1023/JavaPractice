package com.jh.blackjack;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		CardDeck cd = new CardDeck();
		Dealer d = new Dealer();
		Gamer g = new Gamer();

		d.addCard(cd.pick());
		g.addCard(cd.pick());
		d.addCard(cd.pick());
		g.addCard(cd.pick());
		d.needMoreCard(cd);

		Scanner scan = new Scanner(System.in);

		while (true) {
			g.openCards();
			System.out.print("카드 더 받는 다 (Y) :");
			String answer = scan.next();
			if (answer.equals("y")) {
				g.addCard(cd.pick());
			} else {
				break;
			}
		}
		scan.close();
		Rule.getWinner(g, d);

	}

}
