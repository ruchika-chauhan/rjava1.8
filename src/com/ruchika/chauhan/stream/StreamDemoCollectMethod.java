package com.ruchika.chauhan.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemoCollectMethod {
public static void main(String[] args) {
	List<Integer> l =new ArrayList<>();
	l.add(10);l.add(11);l.add(6);l.add(5);l.add(24);l.add(25);	l.add(17);
	List<Integer> s=l.stream().filter(i->i%2==0).collect(Collectors.toList());
	System.out.println("Odd No::"+s);
	List<Integer> l1=l.stream().map(i->i*10).collect(Collectors.toList());
	System.out.println("List multiply by 10 ::"+l1);
	List<Integer>l2 =l.stream().sorted().collect(Collectors.toList());
	System.out.println("Sorted by natural sorting order::"+l2);
	List<Integer>l3=l.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
	System.out.println("Sorted by customized sorting order::"+l3);
	Integer i4=l.stream().min((i1,i2)->i1.compareTo(i2)).get();
	System.out.println("Min value in list::"+i4);
	Integer i5=l.stream().max((i1,i2)->i1.compareTo(i2)).get();
	System.out.println("Max value in list::"+i5);

}
}
