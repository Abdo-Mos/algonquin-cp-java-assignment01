Understand the problem
This program should take two inputs, diameter and the number of coats of vanish need for each table-top. And the expected outcome should be, how many of these table-tops can be varnished using one can of varnish. Also, we already have the square inches value that can be varnished for one can of varnish, which is 46800 square inches of surface.

Based on this requirements, we should have at least 3 java classes for this program:
1.	Calculate the Area class, which is basically the class that is responsible for calculating the area based on the given diameter and then returns the output. This class should have at least three functions, one for getting the diameter, one for calculating the area, and the last one for getting the area which is a getter method that will be called from another classes. Although, we can use the JAVA API Math for getting PI and calculating the Area, I prefer to build this program all from scratch without need from any third party packages.
Since this is the case, we should have the value for PI stored and we should have access to it in the calculate area method.
2.	Calculate how many varnish coats needed class. This class should be responsible for every calculation of the varnish problem, this is sort of the main brain of our program. So we need at least four functions. The first one that is responsible for setting the diameter that user will input, this function will be setter function that will pass the diameter that user gave us the Calculate the area class. Second function would be setting the number of varnish cans user have, this is a setter function. Third function will be the calculation of all of the data we have at this point, which is the area and the number of coats user have, and we should return how many table-tops user can varnish based on the value entered.  SEE A FULL BREAK DOWN FOR THIS CALCULATION BELOW THIS PAGE.
3.	The final class we should have, is the main class which is responsible for running our program. This class’s main job would be only to prompt user by what should they enter, and then get the entered data and pass it to the Calculate how many varnish class, to start working on it and when the Calculate how many varnish class returns the data, this class should output this data to the user.

For calculating the area we should have two main data:
1.	PI
2.	Diameter
If we stored the value of PI in a variable and the diameter in another variable, we could perform this operation by dividing PI with the diameter to the power of 2 and divide the answer by 4: Area is: PI * diameter(d)^2 / 4 e.g. ((PI = 3.141592653589793) * (diameter = 42.5^2)) / 4 = 1418.625433

For calculating how table-tops can be done we should have three main data:
1.	The Area
2.	The number of square inches that can be done with one can
3.	Number of varnish cans user have
If we stored the value of the square inches one varnish can, can finish and the number of varnish cans user have, and the area. We can divide the square inches done with one can by the area, and the answer of this will be divided by the number of varnish cans user have, and then we will have the value which is how many table-tops user can varnish with the varnish cans he has.
e.g. The number of square inches that can be done with one can = 46800, and the number of varnish cans user have is = 4, and the area is = 1418.625433. So based on this values we can perform the following:
1.	46800 / 1418.625433 = 32.98968065  
2.	32.98968065 / 4 = 8.247420162
3.	‘
4.	8.247420162 is the number of table-tops can be varnished


Develop and Describe an Algorithm
UML class diagrams
Main Class
Main
+ diameter: double
+ coats: int

AreaCalculation Class
AreaCalculation
- PI: double
- diameter: double
+ <<constructor>> AreaCalculation()
- calculateArea(d: double): double
+ setDiameter(diameter: double): void
+ getArea(): double

VarnishCalculation Class
VarnishCalculation
- squareInchesPerCan: int
- numOfVarnishCans: int
+ <<constructor>> VarnishCalculation()
+ setVarnishCoat(numOfVarnishCans: int): void
+ setDiameter(diameter: double): void
- calculateNumOfVarnishCans(): double
+ getNumOfVarnishCans(): double

Pseudocode

Class main
public class Main
Start // method main
	declarations
		Scanner scanner
		VarnishCalculation varnishCalculation
	output "Enter Diameter (inches): "
	input diameter
	varnishCalculation.setDiameter(diameter)

	output "Enter Coats Needed: "
	input coats
	varnishCalculation.setVarnishCoat(coats)

		result = varnishCalculation.getNumOfVarnishCans()
		output "___________________________________"
		output "Tables Per One Can: " + result

output "Program By: Abdelrahman Mostafa"
	stop
end class

calculateArea method
double calculateArea(double d)
	start
		double area = PI * (d * d) / 4
		return area
	stop
end method

calculateNumOfVarnishCans method
double calculateNumOfVarnishCans ()
	start
		double area = areaCalculation.getArea()
		double numOfCans = squareInchesPerCan / area
		double result = numOfCans / numOfVarnishCans
		return result
	stop
end method
