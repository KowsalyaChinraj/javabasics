package com.basic;

public class Time {
	int hour;
	int mins;
	int second;
	public Time() {
		
	}
	public Time(int hour,int mins,int second) {
		this.hour=hour;
		this.mins=mins;
		this.second=second;
	}
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMins() {
		return mins;
	}
	public void setMins(int mins) {
		this.mins = mins;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	public void displayTime() {
		System.out.println(hour+":"+mins+":"+second);
	}

	
	public static void main(String args[]) {
		Time t1=new Time();
		t1.setHour(1);
		t1.setMins(45);
		t1.setSecond(5);
		t1.displayTime();
		

	}
}
