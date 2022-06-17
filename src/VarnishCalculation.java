/*
 * Student Name: Abdelrahman Mostafa
 * Lab Professor: Neda Nabavi
 * Due Date: ????????????
 * Modified: ????????????
 * Description: ????????????.
 */

public class VarnishCalculation {
	
	public VarnishCalculation() {
		// no parameter constructor 
	}

	// initialization 
	private AreaCalculation areaCalculation = new AreaCalculation();
	
	/* NOTES
	 * 1 can of varnish (1 litre) will coat 46800 square inches of surface. 
	 */ 
	// class lever variables
	private int squareInchesPerCan = 46800;
	private int numOfVarnishCans; 
	
	// method description 
	// set number of varnish coats 
	public void setVarnishCoat(int numOfVarnishCans) {
		this.numOfVarnishCans = numOfVarnishCans;
	}
	
	// method description 
	// set diameter
	public void setDiameter(double diameter) {
		areaCalculation.setDiameter(diameter);
	}
	
	
	/* NOTES
	 * the number of coats of varnish for each table-top
	 */
	// method description 
	public double calculateNumOfVarnishCans() {
		// get the area
		double area = areaCalculation.getArea();
		// divide the square inches per varnish can, by the area
		double numOfCans = squareInchesPerCan / area;
		// the result of the previous calculation divided by the number of varnish coats 
		double result = numOfCans / numOfVarnishCans;
		return result;
	}
	
}
