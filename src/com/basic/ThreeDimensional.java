package com.basic;

public class ThreeDimensional extends Shape{

	@Override
	public void quadrilateral() {
		int area,perimeter,a=3,b=5,c=1,d=6;
		area=(a+b+c+d)/2;
		perimeter=(a*b+b*c+c*d+d*a);
		System.out.println(area);
		System.out.println(perimeter);
		
	}

	@Override
	public void sphere() {
		double area,perimeter,r=6;
		area=4*3.14*r*r;
		System.out.println(area);
		
	}
	

}
