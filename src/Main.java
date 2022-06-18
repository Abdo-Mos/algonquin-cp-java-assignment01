/*
 * Student Name: Abdelrahman Mostafa
 * Lab Professor: Neda Nabavi
 * Due Date:  June 17, 2022
 * Modified: June 17, 2022
 * Description: THis is the main class. It gets the input from user
 * and then pass it to the Vanish Calculation class to get the 
 * calculation for the varnish coats needed.
 */

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		// initializing new instances 
		Scanner scanner = new Scanner(System.in);
		VarnishCalculation varnishCalculation = new VarnishCalculation();
		
		// class level variables 
		double diameter;
		int coats;

		// getting user input for diameter
		System.out.println("Enter Diameter (inches): ");
		diameter = scanner.nextDouble();
		// setting diameter, see setDiameter method in class VarnishCalculation
		varnishCalculation.setDiameter(diameter);
		
		// getting user input for number of coats needed
		System.out.println("Enter Coats Needed: ");
		coats = scanner.nextInt();
		// setting number of coats needed, see setVarnishCoat method in class VarnishCalculation
		varnishCalculation.setVarnishCoat(coats);
		
		// getting how many tables per one can, see getNumOfVarnishCans in class VarnishCalculation
		double result = varnishCalculation.getNumOfVarnishCans();
		// adding new line to separate the results
		System.out.println("________________________________________" + "\n");
		System.out.println("Tables Per One Can: " + result);
		
		// output program signature 
		System.out.println("Program By: Abdelrahman Mostafa");
	}

}
