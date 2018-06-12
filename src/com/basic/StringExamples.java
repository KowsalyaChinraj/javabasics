package com.basic;

public class StringExamples {
	public static void main(String args[]){
		String one="Good";
		String oneobj=new String("Good");
		String two="Good";
		System.out.println(one==two);
		System.out.println(one.equals(two));
		System.out.println(one.equals(oneobj));
		System.out.println(one.hashCode());
		one=one+"bad";
		System.out.println(one);
		System.out.println(one.hashCode());
		String s="this,is,an,example";
		String ss[]=s.split(",");
		for(int i=0;i<ss.length;i++) {
			System.out.println(ss[i]);
			
		}
		StringBuffer sb=new StringBuffer();
		sb.append("one");
		sb.append("two");
		sb.append("three");
		System.out.println(sb);
		StringBuilder stringbuilder=new StringBuilder();
		stringbuilder.append("one");
		stringbuilder.append("two");
		stringbuilder.append("three");
		System.out.println(stringbuilder);
		
		
	}

}
