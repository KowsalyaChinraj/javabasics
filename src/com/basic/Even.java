package com.basic;

public class Even {
	int one;

	Even() {

	}

	public boolean isEven(int one) {

		return (one % 2 == 0) ? true : false;

	}

	public static void main(String args[]) {
		Even e1 = new Even();

		boolean b = e1.isEven(6);

		System.out.println(b);

	}
}
