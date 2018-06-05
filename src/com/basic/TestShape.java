package com.basic;

public class TestShape {
	
		public static void printShape(Shape shape) {
			shape.square();
			shape.rectangle();
			shape.quadrilateral();
			shape.sphere();
			
		}

		public static void main(String args[]) {
			Shape s=new TwoDimensional();
			Shape s1=new ThreeDimensional();
			printShape(s);
			printShape(s1);
		}
}

		


	


	


