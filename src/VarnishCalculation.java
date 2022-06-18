/*
 * Student Name: Abdelrahman Mostafa
 * Lab Professor: Neda Nabavi
 * Due Date: June 17, 2022
 * Modified: June 17, 2022
 * Description: This class is responsible for calculating 
 * how many varnish coats need for the surface area entered by user.
 */

public class VarnishCalculation {
	
	public VarnishCalculation() {
		// no parameter constructor 
	}

	// initialing new instance of the AreaCalculation class
	private AreaCalculation areaCalculation = new AreaCalculation();
	
	// private, class level variables
	/* NOTES
	 * 1 can of varnish (1 litre) will coat 46800 square inches of surface. 
	 */ 
	private int squareInchesPerCan = 46800;
	private int numOfVarnishCans; 
	
	// this is a set method, that sets that number of varnish cans entered by user
	public void setVarnishCoat(int numOfVarnishCans) {
		this.numOfVarnishCans = numOfVarnishCans;
	}
	
	// this is a set method, this method sets the diameter value by calling the set diameter method from the AreaCalculation class 
	public void setDiameter(double diameter) {
		areaCalculation.setDiameter(diameter);
	}
	
	/* NOTES
	 * The program should accept input for the diameter of the table-tops, the number of coats of varnish for each table-top,
	 * and then output how many of these table-tops can be varnished using one can of varnish.
	 */
	// this method calculates the numbers of varnish cans needed -- see below comments to understand the steps needed to do this calculation
	private double calculateNumOfVarnishCans() {
		// get the area
		double area = areaCalculation.getArea();
		// divide the square inches per varnish can, by the area
		double numOfCans = squareInchesPerCan / area;
		// the result of the previous calculation divided by the number of varnish coats 
		double result = numOfCans / numOfVarnishCans;
		return result;
	}
	
	// this is a get method, this method returns the calculated number of varnish cans needed for surface area
	public double getNumOfVarnishCans() {
		double result = calculateNumOfVarnishCans();
		return result;
	}
	
}
