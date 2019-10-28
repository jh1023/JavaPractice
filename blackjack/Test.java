package com.jh.blackjack;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		
		String one ="1";
		String two ="2";
		
		int a= Integer.valueOf(one);
		int b= Integer.valueOf(two);
		
		System.out.println(a+b);
		System.out.println("숫자를 입력하세요");
/*		int value = scan.nextInt();

		
		switch (value)
		{
		   case 'A':
		       System.out.println("A입니다.");
		       break;
		   case 'J':
		       System.out.println("J입니다.");
		       break;
		   case 'Q':
		       System.out.println("Q입니다.");
		       break;
		   case 'K':
		       System.out.println("K입니다.");
		       break;
		   default:
		       System.out.println(a);
		}
		
		scan.close(); */
		
		int i,j;
		for(i=1; i<=52; i++) {
			for(j=1; j<=4; j++) {
				System.out.printf("i값 %d \t j값 %d\n",i,j);
			}
		}

		
		
		

		
		
	}
	

}
