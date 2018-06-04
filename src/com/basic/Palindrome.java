package com.basic;

public class Palindrome {
	  static int  N; 
	  static int result=0;
//	public Palindrome() {
//		
//	}
	public int  reverse(int N) {
		while(N>0) {
			int remainder=N%10;
			N=N/10;
			result=result*10+remainder;
		}
	return result;
	}
	public static void main(String args[]) {
		Palindrome palindrome=new Palindrome();
		palindrome.reverse(7631);
	System.out.println(result);
	}

}
