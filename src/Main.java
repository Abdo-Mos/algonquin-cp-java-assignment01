/*
 * Student Name: Abdelrahman Mostafa
 * Lab Professor: Neda Nabavi
 * Due Date: ????????????
 * Modified: ????????????
 * Description: ????????????.
 */

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		// initialization 
		Scanner javaScanner = new Scanner(System.in);
		VarnishCalculation varnishCalculation = new VarnishCalculation();
		
		// class level variables 
		final double diameter;
		final int coats;

		// getting user input for diameter
		System.out.println("Enter Diameter (inches): ");
		diameter = javaScanner.nextDouble();
		
		// getting user input for number of coats needed
		System.out.println("Enter Coats Needed: ");
		coats = javaScanner.nextInt();
		
		// set diameter to calculate the area
		varnishCalculation.setDiameter(diameter);
		
		// set number of coats needed
		varnishCalculation.setVarnishCoat(coats);
		
		// getting tables per one can
		double result = varnishCalculation.calculateNumOfVarnishCans();
		System.out.println("Tables Per One Can: " + result);
		
		System.out.println("Program By: Abdelrahman Mostafa");
		
		
	}

}
