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
		for (int z = 0; z < line; z++) {
			for (int i = 0; i < line; i++) {
				if (i < (line - (z + 1))) {
					System.out.print("0");
				} else {
					System.out.print("*");
				}
			}

			System.out.println();
		}

	}

}
