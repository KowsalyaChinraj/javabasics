package com.basic;

import java.util.Arrays;

public class ArrayCopy {
	public static void main(String args[]) {
		int one[]= {2,3,4,5,6};
		int two[]=new int[one.length];
		
		
			System.arraycopy(one, 0, two, 0, one.length);
			System.out.println(Arrays.toString(two));
		}
	}

