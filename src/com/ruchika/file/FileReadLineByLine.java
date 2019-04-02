package com.ruchika.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReadLineByLine {
public static void main(String[] args)  {
	String fileName="E:\\README.txt";
	try(Stream<String> stream=Files.lines(Paths.get(fileName))){
		stream.forEach(System.out::println);
	} catch (IOException e) {
		e.printStackTrace();
	}
	
}
}
