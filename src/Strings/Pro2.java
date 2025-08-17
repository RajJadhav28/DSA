package Strings;

import java.util.StringJoiner;

public class Pro2 {
	public static void main(String[] args) {
//		String str=null;//Exception in thread "main" java.lang.NullPointerException: 
//						//Cannot invoke "String.compareTo(String)" because "str" is 
//						//null
//		int no=str.compareTo("China is a big country!!!");
//		System.out.println(no);
		String s=" Virat"+" Kohli ";
		System.out.println(s);
		String s1=50+50+" Vinod Kamble "+40+40;
		System.out.println(s1);
		String s2=s1.concat(s);
		System.out.println(s2);
		String s3=new String("Hello");
		String s4=new String(" World");
		String s5=String.format("%s%s", s3,s4);
		System.out.println(s5.toString());//String.format()
		//Used for formatting strings using placeholders.
		//Works similarly to printf() in C.
		//Uses format specifiers like %s (string), %d (integer), %f (float).
		String name="Raj";
		int age=27;
		String formattedString=String.format("My name is %s and I am %d years old", name, age);
		System.out.println(formattedString);
		String words[]= {"Hello","Java","World"};
		String joinedString=String.join("", words);
		System.out.println(joinedString);
		StringJoiner s6=new  StringJoiner(",");
		s6.add("Welcome");
		s6.add("World");
		System.out.println(s6.toString());
	}
}
