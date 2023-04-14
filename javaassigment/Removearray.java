package javaassigment;

import java.util.ArrayList;
import java.util.List;

public class Removearray {
public static void main(String[] args) {
	List<String> list_Strings = new ArrayList<String>() ;
	
	list_Strings.add("mango " );
	list_Strings.add("orange " );
	list_Strings.add("papaya");
	list_Strings.add("grapes ");
	list_Strings.add("grapes ");
	list_Strings.add("grapes ");
	
	System.out.println(list_Strings);
	
	System.out.println();
	
	list_Strings.remove(3);
	
	System.out.println("after remove 3rd nub element : " +list_Strings);
	
	
}
}
