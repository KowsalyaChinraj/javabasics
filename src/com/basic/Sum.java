package com.basic;

public class Sum {
	 public static void main(String args[])
	    {
	        double total = 0.0;
	            
	        for (String s : args)
	        {
	            double d = Double.parseDouble(s);
	            total += d;
	        }
	        System.out.println( total);
	    }

}
