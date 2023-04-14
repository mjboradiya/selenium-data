package javaassigment;

import java.util.*;

public class Iteratearray {
public static void main(String[] args) {
	List<String> list_Strings = new ArrayList<String>();
	
	list_Strings.add("maths");
	list_Strings.add("sci");
	list_Strings.add("guj");
	list_Strings.add("s.s");
	list_Strings.add("eng");
	
	for(String element : list_Strings)
	{
		System.out.println(element);
	}
}
}
