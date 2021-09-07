package com.classobject;

class Triangle{
	int side1 = 3;
	int side2 = 4;
	int side3 = 5;
}
public class AreaOfTriangle {
	
	public static void main(String args[]) {
		Triangle areaOfTriangle = new Triangle(); 
		int perimeter = (areaOfTriangle.side1+areaOfTriangle.side2+areaOfTriangle.side3);
		System.out.println("Perimeter is : "+perimeter);
		int semiperimeter = (perimeter)/2;
		//area
		int area = (int) Math.sqrt((semiperimeter*(semiperimeter-areaOfTriangle.side1)*(semiperimeter-areaOfTriangle.side2)*(semiperimeter-areaOfTriangle.side3))) ;
		System.out.println("Area of Triangle is "+area);
	}
}
