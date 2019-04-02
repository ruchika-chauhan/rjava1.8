package com.ruchika.chauhan.lambdatest;

public class AnnonymousInnerClassExample {
int i=888;
public void m2() {
	Interf i=new Interf() {
        int i=999;
		@Override
		public void m1() {
			System.out.println("Inner Class i:"+this.i);
			System.out.println("Outer class i: "+AnnonymousInnerClassExample.this.i);
		}
	};
	i.m1();
}
public static void main(String[] args) {
	AnnonymousInnerClassExample t=new AnnonymousInnerClassExample();
	t.m2();
}
	
}
