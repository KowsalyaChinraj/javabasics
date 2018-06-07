package com.basic;

public class PolyText {
	public static void brake(CarExample car) {
		
		car.brake();
		
	}
	public static void main(String args[]){
		PolyText pt=new PolyText();
		SportsCar sc=new SportsCar();
		PoliceCar pc=new PoliceCar();
		Taxi tc=new Taxi();
		pt.brake(sc);
	pt.brake(pc);
	pt.brake(tc);
	}
}	
