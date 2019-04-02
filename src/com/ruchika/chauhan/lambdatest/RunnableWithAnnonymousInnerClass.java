package com.ruchika.chauhan.lambdatest;

public class RunnableWithAnnonymousInnerClass {
	public static void main1(String[] args) {
		
	 Runnable r=new Runnable() {

		@Override
		public void run() {
			for(int i=0;i<10;i++) {
				System.out.println("child Thread");
			}
		}
	 };
	 Thread t=new Thread(r);
	 t.start();
	 for(int i=0;i<10;i++) {
		 System.out.println("Main Thread");
	 }
	}
	
	// Another short way
	public static void main(String[] args) {
		
		Thread t =new Thread(new Runnable(){
			public void run() {
				System.out.println("Child Thread");
			}
		});
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
		}
	}
	

}
