package com.jh.bbg;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		final int NO_COUNT = 3;
		int[] randomNoArray = new int[NO_COUNT];
		int[] userNoArray = new int[NO_COUNT];

		// 0~9
		int i;
		int j;
		
		//랜덤값 3개 추출 (중복 x)
	/*	
		for (i = 0; i < NO_COUNT; i++) {
			int randomValue = (int) (Math.random() * 9) + 1;// 0~0.999999999

			for (j = 0; j < i + 1; j++) {
				if (randomNoArray[j] == randomValue) {
					i--;
					break;
				} else if (randomNoArray[j] == 0) {
					randomNoArray[j] = randomValue;
					break;
				}

			}

		}
		for (int item : randomNoArray) { 
			System.out.println(item);
		}
		System.out.println("==================================================");

		while(userNoArray[NO_COUNT - 1] == 0) {
			int randomValue = (int)(Math.random() * 9) + 1;
			
			for(int z=0; z<NO_COUNT; z++) {
				if(userNoArray[z] == randomValue) {					
					break;
				} else if(userNoArray[z] == 0) {
					userNoArray[z] = randomValue;
					break;
				}
			}
		}
		
		for(int item : userNoArray) {
			System.out.println(item);
		}
		*/

		//콘솔에서 값을 입력받기 위한 객체
		Scanner scan =new Scanner(System.in);
		//int value1 = scan.nextInt();
		//System.out.println("value1 : "+value1 );
		
		//int value2 =scan.nextInt();
	//	System.out.println("value2: "+ value2);
		
		//scan.close();
		
		
		for(i=0; i < NO_COUNT; i++)
		{
			System.out.println("숫자를 입력하세요");
			userNoArray[i]=scan.nextInt();

			
		}
		scan.close();
		
		
		for(int item: userNoArray) {
			System.out.println("value : "+ item);
		}
	}

}
