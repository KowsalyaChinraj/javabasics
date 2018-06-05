package com.basic;

public class ArrayReverse {
	
	public static void main(String args[]) {
    int i,j;
    int a[]={3,4,5,2,33,24,2 };
	for(i=0,j=a.length-1;i<j;i++,j--) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	for( i=0;i<a.length;i++) {
		System.out.println(a[i]);
		
	}
}


}

