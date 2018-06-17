package com.basic;

import java.io.IOException;

public class RuntimeExample {
	public static void main(String args[]) throws IOException {
		Runtime runtime =Runtime.getRuntime();
		int pro=runtime.availableProcessors();
		System.out.println(pro);
		try {
			Process process=runtime.exec("notepad");
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}

}
}
