package com.java.demo;

public class Demo01 {
	
	public static void main(String[] args) {
		User user=new User();
		Class<? extends User> class1 = user.getClass();
		System.out.println(class1);
	}
}
