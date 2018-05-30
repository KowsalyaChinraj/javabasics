package com.basic;

public class Car {
	String model;
	double speed;
	public Car() {
	}
	
	
	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public double getSpeed() {
		return speed;
	}


	public void setSpeed(double speed) {
		this.speed = speed;
	}


	public boolean start() {
		return true;
		
	}
	public void accelerate() {
		
	}
	public void changeInt(int i) {
		i=i+10;
	}
	public static void main(String args[]) {
		Car car1=new Car();
		Car car2=new Car();
		car1.speed=20;
		car2.speed=30;
		System.out.println(car1.speed);
		System.out.println(car2.speed);
		int count= 100;
		car1.changeInt(count);
		System.out.println(count);

}
}
