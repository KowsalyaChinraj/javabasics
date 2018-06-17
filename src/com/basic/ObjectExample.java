package com.basic;

public class ObjectExample {
	int count;
	String desc;
	public ObjectExample() {
		
	}
	//@Override
	//public String toString() {
		
		//return count+","+desc;
	//}
	public ObjectExample(int count,String desc) {
		this.count=count;
		this.desc=desc;
	}
	
	@Override
	public String toString() {
		return "ObjectExample [count=" + count + ", desc=" + desc + "]";
	}

	public static void main(String args[]){
		ObjectExample oe=new ObjectExample(100,"test");
		System.out.println(oe);
		System.out.println(oe.hashCode());
		
	
		
	}

}
