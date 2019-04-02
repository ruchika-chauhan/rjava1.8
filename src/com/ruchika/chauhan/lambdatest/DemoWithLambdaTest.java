package com.ruchika.chauhan.lambdatest;

public class DemoWithLambdaTest {
public static void main(String[] args) {
	Interf  i=()->System.out.println("m1() method implementation with lambda Expression");
	i.m1();
	
	/*
	 * if we are using return statement in lambda expression than it is mandatory to write return statement 
	 * with in  curly braces. other wise code will not be compile.
	 * Inerf2 j=a->return a*a; is not a valid statement.
*/
	
	
	// Interf2 j= (int a) -> {return a*a; };
	//Interf2 j= (a) -> {return a*a; };
	// Interf2 j= a -> {return a*a; };
	 Interf2 j= a -> a*a; 

	System.out.println("Square Root is::"+j.getSquareIt(4));
}
}
