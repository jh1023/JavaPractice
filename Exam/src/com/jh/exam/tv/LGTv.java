package com.jh.exam.tv;

public class LGTv extends Tv {

	public LGTv() {
	/*	super();
		System.out.println("lg생성자");
		model=str;
		*/
	}

	public void record() {
		System.out.println("녹화를 하고 있습니다.");
	}

	@Override
	void showState() {
		System.out.printf("aaaa");
	}
	
	public String toString() {
		return "LGTV임!!";
	}

	public static String model;

	public LGTv(String str) {
		model = str;
	}
}
