package com.basic;

public class CloneExample implements Cloneable{
	Car car;
	Taxi taxi;
	public CloneExample() {
		car=new Car();
		taxi= new Taxi();
		
	}
	public static void main(String args[]) {
		//try {
		CloneExample ceone=new CloneExample();
		CloneExample cetwo=(CloneExample)ceone.clone();
		System.out.println(ceone.hashCode() +"==="+ cetwo.hashCode());
		System.out.println(ceone.car.hashCode() +" car hashCode " + cetwo.car.hashCode());
		System.out.println(ceone.taxi.hashCode() +" taxi hashCode " + cetwo.taxi.hashCode());
	}catch(Exception e) {
		e.printStackTrace();
	}
	}
}

