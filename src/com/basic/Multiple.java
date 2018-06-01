package com.basic;

public class Multiple {
	int one;int two;
	
	Multiple(){
		
	}
	public boolean isMultiple(int one,int two) {
		return (two%one==0)?true:false;
		
	}
	public static void main(String args[]) {
		Multiple m1=new Multiple();
		
		
	  boolean b=m1.isMultiple(6,5);
	  
	  
	 
	  
	  System.out.println(b);
	  
	  
	}
		
		
		
	
		
	

}
