package com.jh.exam.tv;

public class Tvtest3 {
	public static void main(String[] args) {
		
		LGTv tv1= new LGTv("AA-BB1"); //return 타입 x
		System.out.println(tv1.model);
		
		LGTv tv2= new LGTv();
		System.out.println("model: "+tv2.model);
		
		LGTv tv3= new LGTv("XE-123");
		System.out.println(tv3.model);
		
		Tv tv=tv1; //Tv타입이 LGTv의 부모이기때문에 타입 저장가능
		tv.showState();
		
		
		
		
	}

}
//메소드 만들고 static 붙이고 빨간줄 안뜨면 놔두고 뜨면 지운다.