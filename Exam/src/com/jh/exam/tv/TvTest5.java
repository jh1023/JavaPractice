package com.jh.exam.tv;

public class TvTest5 {
	public static void main(String[] args) {
		SamSungTv sstv =new SamSungTv();
		LGTv lgtv =new LGTv();
		
		mainShowState(sstv);
		mainShowState(lgtv);
	}

	public static void mainShowState(Tv tv) { //다형성

		tv.showState();
	}

	
	
}
