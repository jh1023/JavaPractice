package com.jh.test;

import java.util.Arrays;

public class CardMain {
	private Card[] cards;

	public static void main(String[] args) {
		CardMain cd = new CardMain();
		Card c = new Card("spade", 1);
		cd.showCards();

	}

	public CardMain() {
		init();

	}

	private void init() {
		cards = new Card[52];
		int oneCardCnt = 13; // 한 모양의 카드 갯수
		String[] shapes = { "spade", "heart", "clover", "diamond" };
		int idx = 0;
		for (int i = 0; i < shapes.length; i++) { // 4
			for (int z = 0; z < oneCardCnt; z++) { // 13
				Card c = new Card(shapes[i], z);
				cards[idx++] = c;
			}
		}
	}

	public void showCards() { //
		for (Card c : cards) {
			System.out.println(c);
		}
	}

}
