package com.jh.vmv1;

public class Drink {

	private String pName;		//제품명
	private int price;		//가격
	
		
	public Drink(String pName, int price) { //생성자는 리턴타입x 클래스명이랑 같음
	
		this.pName = pName;
		this.price = price;
	}
	
	public String getpName() { //내가 외부로 줘야하는 값.
		
		return pName;
	}
	
	public void setpName(String pName) { //외부에서 들어오는 값 세팅
		this.pName = pName;
	}
	
	
	
	public int getPrice() {
		
		return price;
	}
	
	public void setPrice(int price) {
		
		this.price = price;
	}

	@Override
	
	public String toString() {
		return String.format("%s(%d)원",pName,price);
	}

	

}
