package com.basic;

import java.util.Scanner;

public class WiFiPassword {
	public static void main (String args[]) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the guest name");
	String lastName=sc.next();
	System.out.println("Enter the roomNumber");
	int roomNo=sc.nextInt();
	WiFiPassword wp=new WiFiPassword();
	wp.createWifiPin(roomNo,lastName);
	System.out.println();
	}
	
	
	
	
	public static void createWifiPin(int roomNo, String lastName) { 
		int hundred=0;
		int tens=0;
		int units=0;
		if((roomNo>99)&&(roomNo<=999)) {
			hundred=roomNo%100;
			tens=hundred/10;
			units=roomNo%10;
		}
		System.out.println(tens);
		System.out.println(units);
		
	
	String str=new String(lastName);
	char name=str.charAt(str.length()-1);
	int n,sum=0;
	while(roomNo>0) {
		n=roomNo%10;
		sum=sum+n;
		roomNo=roomNo/10;
	}
	System.out.println(sum);
	char s=0;
	switch(units) {
	case 1:
		if(units==1) {
			s='!';
			break;
		}
	case 2:
		if(units==2) {
			s='@';
			break;
		}
	case 3:
		if(units==3) {
			s='#';
			break;
		}
	case 4:
		if(units==4) {
			s='$';
			break;
		}
	case 5:
		if(units==5) {
			s='%';
			break;
		}
	case 6:
		if(units==6) {
			s='^';
			break;
		}
	case 7:
		if(units==7) {
			s='&';
			break;
		}
	case 8:
		if(units==8) {
			s='*';
			break;
		}
	case 9:
		if(units==9) {
			s='(';
			break;
		}
		
	}
	

	
	System.out.println("password :"+sum+s+name+tens);
}
}


