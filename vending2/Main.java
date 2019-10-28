package com.jh.vmv2;

public class Main {
	public static void main(String[] args) {
		VendingMachine vm =new VendingMachine();

		vm.putProduct(1, 10);
		vm.purchase(1, 10000);
		vm.showDrinks();


	}



}
