package com.jh.algo;

import java.util.Arrays;

public class Sorting {
	public static void main(String[] args) {
		int[] array = { 9, 10, 1, 4, 77, 100, 20, 12, 5 };

		System.out.println(Arrays.toString(array));// 정렬전
		// selectSort(array); //sort정렬
		bubbleSort(array); //버블정렬
		System.out.println(Arrays.toString(array)); // 정렬 후

	}

	/*
	 * 배열의 0번째값과 1번째 값을 비교해서 1번째 값이 크면 temp에 담은 후에 0번째값으로 옮기는 식으로 배열끝까지 비교함 (sort
	 * 정렬)
	 */
	public static void selectSort(int[] array) {

		for (int i = 0; i < array.length - 1; i++) {
			for (int z = i + 1; z < array.length; z++) {
				if (array[i] > array[z]) {
					int temp = array[i];
					array[i] = array[z];
					array[z] = temp;
				}
			}

		}

	}

	public static void bubbleSort(int[] array) {
		for (int i = 1; i <= array.length; i++) {
			for (int z = 0; z < array.length - i; z++) {
				int iL = z;
				int iR = z + 1;
				if (array[iL] > array[iR]) {
					int temp = array[iL];
					array[iL] = array[iR];
					array[iR] = temp;

				}

			}
		}

	}

}
