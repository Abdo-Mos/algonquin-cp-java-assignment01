/*
 * Student Name: Abdelrahman Mostafa
 * Lab Professor: Neda Nabavi
 * Due Date: June 17, 2022
 * Modified: June 17, 2022
 * Description: This class is responsible for calculating the 
 * area of a surface.
 */

public class AreaCalculation {
	
	public AreaCalculation() {
		// no parameter constructor 
	}

	// private, class level variables
	private double PI = 3.141592653589793;
	private double diameter;
	
	// this method gets the diameter as a parameter, then calculates the area and returns the results 
	// see below comment for the equation for calculating the area
	/* NOTES
	 * Area is: PI * diameter(d)^2 / 4
	 */
	private double calculateArea(double d) {
		final double area = PI * (d * d) / 4;
		return area;
	}
	
	// this is a set method, this method gets the diameter as a parameter and sets it 
	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}
	
	// this method gets the area by calling the calculateArae function and then return the surface area
	public double getArea() {
		double surfaceArea = calculateArea(diameter);
		return surfaceArea;
	}
}
