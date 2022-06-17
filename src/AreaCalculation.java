/*
 * Student Name: Abdelrahman Mostafa
 * Lab Professor: Neda Nabavi
 * Due Date: ????????????
 * Modified: ????????????
 * Description: ????????????.
 */

public class AreaCalculation {
	
	AreaCalculation() {
		// no parameter constructor 
	}

	// class level variables
	private double PI = 3.141592653589793;
	private double diameter;
	
	/* NOTES
	 * Area is: PI * diameter(d)^2 / 4
	 */
	// method description 
	private double calculateArea(double d) {
		final double area = PI * (d * d) / 4;
		return area;
	}
	
	// method description 
	// set diameter
	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}
	
	// method description 
	// get area 
	public double getArea() {
		final double surfaceArea = calculateArea(diameter);
		return surfaceArea;
	}
}
