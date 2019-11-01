package com.jh.algo;

class Test {	
	int value;
	
	Test(int v) {
		value = v;
	}
}

public class ListTest {

	public static void main(String[] args) {
		FList<Integer> list = new FArrayList();		
		list.add(50);
		list.add(51);
		list.add(52);
		list.add(53);
		list.add(54);
		list.add(55);
		
		for(int i=0; i<list.size(); i++) {
			System.out.printf("%d - %d\n", i, list.get(i));
		}
		
		list.remove(2);
		System.out.println("-------------------");

		for(int i=0; i<list.size(); i++) {
			System.out.printf("%d - %d\n", i, list.get(i));
		}
	}

}