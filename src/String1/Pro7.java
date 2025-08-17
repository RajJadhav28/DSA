package String1;

import java.util.StringJoiner;

public class Pro7 {
	public static void main(String[] args) {
		String s3=new String("Hello");
		String s4=new String(" World");
		String s5=String.format("%s%s", s3,s4);
		System.out.println(s5);
		
		String name="Raj";
		int age=27;
		String formattedString=String.format("My name is %s and I am %d years old", name, age);
		System.out.println(formattedString);
		String words[]= {"Hello", " Java"," World"};
		String joinedString=String.join("", words);
		System.out.println(joinedString);
		StringJoiner s6=new StringJoiner(",");
		s6.add("Welcome");
		s6.add("World");
		System.out.println(s6);
		System.out.println(s6.toString());
	}
}
