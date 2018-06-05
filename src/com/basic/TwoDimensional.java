package com.basic;

public class TwoDimensional extends Shape{

	@Override
	public void square() {
		int area,perimeter,side=5;
		area=side;
		perimeter=4*side;
		System.out.println(area);
		System.out.println(perimeter);
		
		
	}

	@Override
	public void rectangle() {
		int area,perimeter,l=4,w=5;
		area=l*w;
		perimeter= 2*(l+w);
		System.out.println(area);
		System.out.println(perimeter);
		
		
	}
	

}
