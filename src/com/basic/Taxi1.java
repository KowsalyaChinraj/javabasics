package com.basic;

public class Taxi1 extends CarExample1{
public Taxi1() {
	System.out.println("Taxi1 cons called");
	
}
//public Taxi1(int i) {
	//System.out.println("Taxi1 cons one argument called");
//}
@Override
public void brake() {
	
System.out.println("brake in cons Taxi1 called");
}
public static void main(String args[]) {
	CarExample1 car=new Taxi1();
	
	car.brake();
	
}

}
