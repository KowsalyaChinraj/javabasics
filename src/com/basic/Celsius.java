package com.basic;

public class Celsius {
	static double fahrenheit=10,celsius=10;
	Celsius(){
		
	}
	
	public static double convert(double Celsius) {
		return 5.0/9.0*(fahrenheit-32);
	}
	
	public static double converttoTop(double fahrenheit ) {
		return 9.0/5.0*(celsius+32);
		
	}
	public static void main(String args[]) {
		Celsius c=new Celsius();
		Celsius c2=new Celsius();
		
		c.converttoTop(fahrenheit);
	c2.convert(celsius);
		System.out.println(c.converttoTop(fahrenheit));
		System.out.println(c2.convert(celsius));
		
	
	
}
}
