package com.jh.exam.tv;

public class TvTest4 {
	public static void main(String[] arg)
	{
		LGTv lgtv =new LGTv();
		
		Tv tv = lgtv; //자동형변환

		LGTv lgtv2 = (LGTv)tv; //강제형변환 
		
		tv = new SamSungTv();
		//LGTv lgtv = (LGTv)tv;// 자식타입으로는 부모타입을 가르킬수 없다. 자식이 부모보다 범위가 같거나 더 넓다.
		SamSungTv sstv2 = (SamSungTv)tv;
		
	}

}
