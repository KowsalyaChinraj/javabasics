package com.basic;

public class MaximumMinimum {
	int a[]= {3,4,5,2,33,24,2,};
	public  int maximum() {
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
			
		}
		return max;
	}
	public int minimum() {
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
		
	}
		}	return min;
		}
	
public static void main(String args[]) {
	MaximumMinimum max=new MaximumMinimum();
	max.maximum();
	max.minimum();
	System.out.println(max.maximum());
	System.out.println(max.minimum());
}
}

