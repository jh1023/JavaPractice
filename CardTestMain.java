package com.jh.test;

import java.util.Arrays;

public class CardTestMain {
	private Card[] cards;

	public static void main(String[] args) {
		CardTestMain cd = new CardTestMain();
		cd.showCards("스페이드","A");
		

	}

	public CardTestMain() {
		init();
	}

	private void init() {
		cards = new Card[52];
		String[] oneCardCnt = { "A", "1", "2", "3", "4", "5", "6", "7", "8", "9", "J", "Q", "K" };
		String[] shapes = { "스페이드", "하트", "클로버", "다이아몬드" };

		int idx = 0;
		for (int i = 0; i < shapes.length; i++) {
			for (int z = 0; z < oneCardCnt.length; z++) { // 13
				Card c = new Card(shapes[i], z);
				cards[idx++] = c;
			}
		}
	}
	
	public void showCards(String a, String b) { //
			System.out.println(a+b);
		
	}

}
