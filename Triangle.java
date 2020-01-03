//********************************************************************************
//	Triangle.java		Author: Ian Nobile
//
//	This is a class called "Triangle" that represents the concept of a triangle 
//	by defining the (x, y) coordinates of its three vertices. All values are 
//	rounded to two decimal places.
//
//********************************************************************************

import java.text.DecimalFormat;
import java.lang.Math;

public class Triangle
{
	//----------------------------------------------------------------------------
	//	Represents the concept of a triangle by defining the (x, y) coordinates of
	//	three vertices
	//----------------------------------------------------------------------------
	
	//	Instance variables for the vertices, length of each side, area and perimetre.
	private double AX = 0.00;
	private double AY = 0.00;
	private double BX = 0.00;
	private double BY = 0.00;
	private double CX = 0.00;
	private double CY = 0.00;
	private double sideA = 0.00;
	private double sideB = 0.00;
	private double sideC = 0.00;
	private double perimetre = 0.00;
	private double heron = 0.00;
	private double area = 0.00;
	//	This rounds all values to two decimal places:
	DecimalFormat fmt = new DecimalFormat("##.00");
	
	public Triangle(double pointAX, double pointAY, double pointBX, double pointBY, double pointCX, double pointCY)
	{
		//------------------------------------------------------------------------
		//	a constructor that initialises a Triangle object by accepting the (x, y)
		//	coordinate values for a triangle’s vertices.
		//------------------------------------------------------------------------
		AX = pointAX;
		AY = pointAY;
		BX = pointBX;
		BY = pointBY;
		CX = pointCX;
		CY = pointCY;
	}
	
	public void sideLength()
	{
		//------------------------------------------------------------------------
		//	a method that calculates the length of each side and stores the values
		//------------------------------------------------------------------------
		sideA = Math.sqrt(Math.pow((CX - BX), 2) + Math.pow((CY - BY), 2));
		sideB = Math.sqrt(Math.pow((AX - CX), 2) + Math.pow((AY - CY), 2));
		sideC = Math.sqrt(Math.pow((BX - AX), 2) + Math.pow((BY - AY), 2));
	}

	public void perimetre()
	{
		//------------------------------------------------------------------------
		//	a method to calculate and store the value of the triangle’s perimetre.
		//------------------------------------------------------------------------
		perimetre = sideA + sideB + sideC;
		heron = perimetre / 2;
	}

	public void area()
	{
		//--------------------------------------------------------------------------
		//	Heron of Alexandria's method to calculate and store the triangle’s area.
		//--------------------------------------------------------------------------
		area = Math.sqrt((heron) * (heron - sideA) * (heron - sideB) * (heron - sideC));
	}
	
	//------------------------------------------------------------------------
	//	The following are simple methods that print the requested values:
	//------------------------------------------------------------------------
	public void getPointAX()
	{
		System.out.println(AX);
	}
	
	public void getPointAY()
	{
		System.out.println(AY);
	}
	
	public void getPointBX()
	{
		System.out.println(BX);
	}
	
	public void getPointBY()
	{
		System.out.println(BY);
	}
	
	public void getPointCX()
	{
		System.out.println(CX);
	}
	
	public void getPointCY()
	{
		System.out.println(CY);
	}
	
	public void getSideA()
	{
		System.out.println(sideA);
	}
	
	public void getSideB()
	{
		System.out.println(sideB);
	}
	
	public void getSideC()
	{
		System.out.println(sideC);
	}
	
	public String getPerimetre()
	{
		//------------------------------------------------------------------------
		//	a getter method that returns the triangle’s perimetre as a String
		//------------------------------------------------------------------------
		return fmt.format(perimetre);
	}
	
	public String getArea()
	{
		//------------------------------------------------------------------------
		//	a getter method that returns the triangle’s area as a String.
		//------------------------------------------------------------------------
		return fmt.format(area);
	}
	
	public String toString()
	{
		//------------------------------------------------------------------------
		//	a toString() method that returns a nicely formatted multi-line 
		//	information of the triangle object, including the its vertices, sides, 
		//	area, and perimetre.
		//------------------------------------------------------------------------
        return "About your triangle: \n\tPoint A: \t(" + fmt.format(AX) + ", " + 
		fmt.format(AY) + ")\n\tPoint B: \t(" + fmt.format(BX) + ", " + 
		fmt.format(BY) + ")\n\tPoint C: \t(" + fmt.format(CX) + ", " + 
		fmt.format(CY) + ")\n\tSide A: \t" + fmt.format(sideA) + "\n\tSide B: \t" 
		+ fmt.format(sideB) + "\n\tSide C: \t" + fmt.format(sideC) + 
		"\n\tPerimetre: \t" + getPerimetre() + "\n\tTotal Area: \t" + getArea();
	}
	
} //end main

