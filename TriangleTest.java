//********************************************************************************
//	Triangle.java		Author: Ian Nobile
//
//	This is a class called "TriangleTest" that includes statements to test each 
//	method and to display the values of an object created from the Triangle class.
//	All values have been rounded to two decimal places.
//
//********************************************************************************

import java.util.Scanner;

public class TriangleTest extends Triangle
{
	//----------------------------------------------------------------------------
	//	Apparently, inheritance in Java does not include constructors, so:
	//----------------------------------------------------------------------------
	public TriangleTest(double pointAX, double pointAY, double pointBX, double
			pointBY, double pointCX, double pointCY)
	{
		super(pointAX, pointAY, pointBX, pointBY, pointCX, pointCY);
	} //	end constructor

	public static void main(String[] args)
	{
		//	This main method prompts the user for and accepts values for the (x, y) 
		//	coordinates of three vertices for a triangle object and uses those
		//	points to create a Triangle object
		
		Scanner scan = new Scanner(System.in);
		double pointAX = 0.00; 
		double pointAY = 0.00;
		double pointBX = 0.00;
		double pointBY = 0.00;
		double pointCX = 0.00;
		double pointCY = 0.00;
		
		System.out.println("Hello, and welcome to the Triangle Tester.");
		System.out.print("Please enter the (x, y) values of point A of your "
				+ "desired triangle separated by a space: ");
		pointAX = scan.nextDouble();
		pointAY = scan.nextDouble();
		System.out.print("Now, please enter the values for point B separated by "
				+ "a space: ");
		pointBX = scan.nextDouble();
		pointBY = scan.nextDouble();
		System.out.print("And finally, the values of point C, please: ");
		pointCX = scan.nextDouble();
		pointCY = scan.nextDouble();
		Triangle triangle1 = new Triangle (pointAX, pointAY, pointBX, pointBY, pointCX, pointCY);
		System.out.println("Thank you! \n");
		//The following three function calls prompt calculations using the above points
		triangle1.sideLength();
		triangle1.perimetre();
		triangle1.area();		
		System.out.println(triangle1.toString());
		scan.close();
	}
	
}

