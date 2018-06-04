package com.basic;

public class PerfectNumber {
	static  int sum=0,i,number;
	public  static boolean isPerfect(int number) {
		for(i=1;i<6;i++) {
			if(number%i==0)	{
				sum=sum+i;
				
				
			}
			
			
	}
		if(sum==number) {
			return true;
		}else {
			return false;
		}
}
	public static void main(String args[]){
		PerfectNumber perfect=new PerfectNumber();
		System.out.println(perfect.isPerfect(9));
	}
	
}
