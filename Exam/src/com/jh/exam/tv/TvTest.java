package com.jh.exam.tv;

public class TvTest {

	public static void main(String[] args) {
		//객체화, 인스턴스
		
		Tv tv1 = new Tv(-1,19); // 주소값 (레퍼런스 변수 )(참조변수) 대문자로 시작하면 주소값 (Tv.java)
	

		Tv tv2 =new Tv(1000, 19);
		int volume = tv2.getVolume();
		tv2.setChannel(100);  //여기에서 최대값 조정 가능함
		tv2.setVolume(15);
		System.out.println("tv2의 볼륨" +volume);
		tv1.setChannel(300);
		tv1.setVolume(-1);
		tv1.showState();
		tv2.showState();
		
	}

}

