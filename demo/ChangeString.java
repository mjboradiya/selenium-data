package demo;

public class ChangeString {
public static void main(String[] args) {
	StringBuffer s = new StringBuffer("java");
	System.out.println("s= " +s);
	s.append("hello");
	System.out.println("s= " +s);
	
	StringBuilder s1 = new StringBuilder("java");
	System.out.println("s1= " +s1);
	s1.append("hello");
	System.out.println("s1 = " +s1);
}
}
