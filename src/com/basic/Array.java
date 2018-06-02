package com.basic;

public class Array {
	
	public static void main(String args[]) {
		 int N=4535, i=0;
	int arr[]=new int[10];
	while(N>0) {
		int remainder=N%10;
	    arr[i]=remainder;
	    i++;
	    N=N/10;
	

	}
	for(i=0;i<10;i++) {
		System.out.println(arr[i]);
	}
}
}
