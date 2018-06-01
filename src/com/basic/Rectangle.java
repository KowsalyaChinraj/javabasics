package com.basic;

public class Rectangle {
	double length;
	double width;
	public Rectangle(){
		
	}
	public Rectangle(double length,double width) {
		if((length>0.0&&length<20.0)&&(width>0.0&&width<20.0))
		{
		this.length=length;
		this.width=width;
		
		}else {
		System.out.println("the length and width value is wrong");
	}
	}
	public double findRectangleArea() {
		return length*width;
	}
	public double findRectanglePerimeter() {
		return 2*(length+width);
	}


public static void main(String args[]) {
	
Rectangle r1=new Rectangle(6,2);
System.out.println(r1.findRectangleArea());
System.out.println(r1.findRectanglePerimeter());
}
}

