package com.basic;

public class label {
	public static void main(String args[]) {
		int i,j;
one:		for(i=0;i<6;i++) {
two:			for(j=0;j<4;j++) {
				if(j==2) {
					continue one;
				}
				if(j==3) {
					continue two;
				}
				System.out.println("i="+i+"j="+j);
		}
	}

	}
}
