package com.jh.exam;

public class StringTest {
	public static void main(String[] args) {
		
		String str1 = new String("안녕하세요");
		String str2 = new String("안녕하세요");
				
		System.out.println(str1 == str2);  //주소가 같은지 알고 싶을때
		
		System.out.println(str1.equals(str2));  //equals : 값이 같은지 알고 싶을때
		
		
		if(str1.equals("안녕하세요")) {
			System.out.println("if2");
			
		}
		
		if("안녕하세요".equals(str1)) {
			
			System.out.println("if3");
		}

	}
	

}
