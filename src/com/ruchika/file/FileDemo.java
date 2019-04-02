package com.ruchika.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileDemo {
public static void main(String[] args) {
	
	String filePath="E:\\README.txt";
	List<String> list=new  ArrayList<>();
	try(Stream<String> stream=Files.lines(Paths.get(filePath))){
		// convert file into uppercase
		list=stream.map(String::toUpperCase).collect(Collectors.toList());
		list.forEach(System.out::println);
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
