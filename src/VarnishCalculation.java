/*
 * Student Name: Abdelrahman Mostafa
 * Lab Professor: Neda Nabavi
 * Due Date: ????????????
 * Modified: ????????????
 * Description: ????????????.
 */

public class VarnishCalculation {
	
	VarnishCalculation() {
		// no parameter constructor 
	}

	// initialization 
	AreaCalculation areaCalculation = new AreaCalculation();
	
	// 1 can of varnish (1 litre) will coat 46800 square inches of surface
	private int squareInchesPerCan = 46800;
	private int numOfVarnishCans; 
	
	// set number of varnish coats 
	public void setVarnishCoat(int numOfVarnishCans) {
		this.numOfVarnishCans = numOfVarnishCans;
	}
	
	
	// to calculate how many can be varnished using one can of varnish for each table given the number of coats
	public double calculateNumOfVarnishCans(double diameter) {
		// get the area
		areaCalculation.setDiameter(diameter);
		double area = areaCalculation.getArea();
		// divide square inches per varnish can, by the area
		double numOfCans = squareInchesPerCan / area;
		// the result of the previous calculation divided by the number of varnish coats
		double result = numOfCans / numOfVarnishCans;
		return result;
	}
	
}
