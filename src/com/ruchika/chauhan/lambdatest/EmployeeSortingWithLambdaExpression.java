package com.ruchika.chauhan.lambdatest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeSortingWithLambdaExpression {
public static void main(String[] args) {
	List<Employee> l=new ArrayList<>();
	l.add(new Employee(100,"Deepika"));
	l.add(new Employee(800,"Ruchika"));
	l.add(new Employee(500,"Priyanka"));
	l.add(new Employee(200,"Swatika"));
	l.add(new Employee(900,"Kamnaka"));
	l.add(new Employee(700,"himanika"));
	l.add(new Employee(600,"Rubika"));
	l.add(new Employee(10,"Sunnyika"));
	System.out.println("Before Sorting::"+l);
	Collections.sort(l,(e1,e2)->(e1.eno>e2.eno)?1:(e1.eno<e2.eno)?-1:0);
	System.out.println(" Ascending Sorting::"+l);
	Collections.sort(l,(e1,e2)->(e1.eno>e2.eno)?-1:(e1.eno<e2.eno)?1:0);
	System.out.println(" Descending Sorting::"+l);


}
}
