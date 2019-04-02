package com.ruchika.chauhan.functionalinterface;

import java.util.function.Supplier;

public class SupplierDemo {

	
	public static void main(String[] args) {
		Supplier<String> s=()->{
			String otp="";
			for(int i=0;i<5;i++) {
				int x=(int)(Math.random()*9);
				otp=otp+x;
			}
			return otp;
		};
		
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());

	}
}
