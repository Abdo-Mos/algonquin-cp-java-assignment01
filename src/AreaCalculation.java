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

	private double PI = 3.141592653589793;
	private double diameter;
	
	// area is PI * diameter(d)^2 / 4
	private double calculateArea(double d) {
		final double area = PI * (d * d) / 4;
		return area;
	}
	 
	// set diameter
	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}
	
	// get area 
	public double getArea() {
		final double surfaceArea = calculateArea(diameter);
		return surfaceArea;
	}
	
	
}
