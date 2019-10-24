package com.jh.exam;

public class Main 
{
	public static void main(String[] args) 
	{
				
		printStar(5);
	}
		
	
	public static void printStar(int line)
	{
		int i;
		int z;
		
		for(z= 0; z < line; z++) {
		for(i=0; i < line; i++) {
			System.out.print("*");
			
			}
		System.out.println("");

		}
		
	}
	
	
	
}
