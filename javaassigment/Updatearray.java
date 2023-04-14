package javaassigment;

//import java.util.ArrayList;
//import java.util.List;

import java.util.*;

public class Updatearray {
 public static void main(String[] args) {
	
	 List<String> list_Strings = new ArrayList< String >();
	 
	 list_Strings.add("mango");
	 list_Strings.add("papaya");
	 list_Strings.add("banana");
	 
	 System.out.println(list_Strings);
	 
	 list_Strings.add(0 , "pineapple");
	 list_Strings.add(4 , "apple"); 
	 
	 System.out.println(list_Strings);
	 
}
}
