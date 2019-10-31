package com.jh.algo;

public class PrintStar {
	public static void main(String[] args) {

		// printStar(5);
		reversPrintStar(5);

	}

	public static void printStar(int line) {
		for (int i = 0; i < line; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}

	public static void reversPrintStar(int line) {
		for (int i = 0; i < line; i++) {
			for (int j = line; j >= 0; j--) {
				if (j > i) {

					System.out.print("");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
