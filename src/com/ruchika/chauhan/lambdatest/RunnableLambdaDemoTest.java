package com.ruchika.chauhan.lambdatest;

public class RunnableLambdaDemoTest {
public static void main1(String[] args) {
	
	Runnable r= ()->{
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread Running");			
		}
	};
	
	Thread t=new Thread(r);
    t.start();
    for (int i = 0; i < 10; i++) {
		System.out.println("Main Thread Running");
	}
}

// More simplify runnable with lambda expression.

public static void main(String[] args) {
	Thread t=new Thread (()-> {
		for(int i=0;i<10;i++) {
		System.out.println("Child Thread");	
		}
	});
	t.start();
	for(int i=0;i<10;i++) {
		System.out.println("Main Thread");
	}
}
}

