package com.basic;

import java.io.IOException;

public class RuntimeExample2 {
	public static void main(String args[])  {
		long start=System.currentTimeMillis();
		long startNano=System.nanoTime();
	
		Runtime runtime =Runtime.getRuntime();
		int pro=runtime.availableProcessors();
		System.out.println(pro);
		long end=System.currentTimeMillis();
		System.out.println(end-start);
		long endNano=System.nanoTime();
		System.out.println(endNano-startNano);
		System.out.println(System.getenv());
		
	

}
}
