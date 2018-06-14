package com.basic;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import sun.net.www.URLConnection;

public class Exception {
	public static void main(String args[]) {
		
	
      try {
		URL url=new URL("http://www.google.com");
//		URLConnection connection= url.openConnection();
			
		System.out.println("last line of array");
      }catch(MalformedURLException e) {
    	  System.out.println("Mal formed URL Exception");
    	  e.printStackTrace();
		
	}catch(IOException e) {
		  e.printStackTrace();
			
		
	}finally {
		System.out.println("finally");
		
	}

	}

		
	}

