package com.ruchika.chauhan.doublecolon;

public class DoubleColon {
public void show() {
	System.out.println("Hello Ruchika You are a good girl");
}
public static void showw() {
	System.out.println("I am in static method ");
}
public static void main(String[] args) {
	DoubleColon dc=new DoubleColon();
	//Syntax for Instance Method :---->Instance Name :: method name;
	Interf i = dc::show;
	i.display();
	// Syntax for Static Method :---> Class Name :: static method name;
	Interf j=DoubleColon::showw;
	j.display();
	
}
}
