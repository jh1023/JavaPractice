package com.jh.exam;

public class ArrayTest {

	public static void main(String[] args) {
		int[] array2 = new int [10];
		

		
		String[] array3 = new String[5];
		
		String str1 = new String("하나");
		
		array3[0] = str1;
		array3[1] = "둘";
		int[] array = { 4,5,10,22,80,11};

		
		printArrayValue(array);		
		
		/*int[] arr2= { 1,4};
		printArrayValue(arr2);		*/

	}
	
	
	public static void printArrayValue(String[] arr) {
		for (String str : arr) {
			System.out.println(str);
		}
	}
	
	
	public static void printArrayValue(int[] arr) {
		int sum=0;

/*		for (int i=0; i < arr.length; i++) {

			System.out.println(arr[i]);
			sum = sum + arr[i];
			

		}*/
		
		for(int num : arr) {
			sum= sum + num;
			System.out.println(num);			
		}
		System.out.println("합계:" + sum);
	}
}
