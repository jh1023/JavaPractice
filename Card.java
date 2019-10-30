package com.jh.test;

// 카드모양, 카드값을 저장하는 멤버필드(A,2~10,J,Q,K)
// 멤버필드 은닉화
// 멤버필드에 값을 주입할수 있는 생성자
// 카드모양 멤버필드의 값을 가져올수 있는 getter메소드
// 카드값 멤버필드의 값을 가져올수 있는 getter메소드

public class Card { 
	public final String shape; //멤버필드, 은닉화
	public final String mark;
	public final int value;

	// 0~12
	public Card(String shape, int value) { //생성자
		this.shape = shape;
		this.mark = getMark(value);
		this.value = getValue(value);
	}

	private String getMark(int value) { //getter메소드
		switch (value) {
		case 0:
			return "A";
		case 10:
			return "J";
		case 11:
			return "Q";
		case 12:
			return "K";
		default:
			return Integer.toString(value + 1);
		}
	}

	private int getValue(int value) {
		if (value > 9) {
			return 10;
		} else {
			return value + 1;
		}
	}

	@Override
	public String toString() {
		return String.format("%s - %s - %d", shape, mark, value);
	}
}
