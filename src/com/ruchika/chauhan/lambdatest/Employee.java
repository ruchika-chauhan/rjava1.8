package com.ruchika.chauhan.lambdatest;

public class Employee {
int eno;
String ename;
Employee(int eno,String ename)
{this.eno=eno;
this.ename=ename;
}
public String toString() {
	
	return eno+":"+ename;
}
}
