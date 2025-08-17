package Strings;

import java.util.Arrays;

public class Pro3 {
	public static void main(String[] args) {
		String s="Virat Kohli";
		System.out.println("Orignal String:"+s);
		System.out.println("Substring starting from index 6:"+s.substring(6));
		System.out.println("SubString starting from index 0 to 6:"+s.substring(0,6));
		
		String text=new String("Hello, My name is Khan");
		String sentences[]=text.split("\\2");
		System.out.println(Arrays.toString(sentences));
		// Using Lambda Expression to print words
		//Arrays.stream(sentences).forEach(word -> System.out.println(word));
		char ch1[]=new char[6];//ch1 is a character array (char[])
		//char[] is an array that holds characters
//new char[6] initializes an array of size 6, meaning it can store six char values.
//Arrays.stream(sentences) converts the array into a stream.
		text.getChars(0, 6, ch1, 0);
		// Using Lambda Expression to print characters
       //Arrays.stream(new String(ch1).split("")).forEach(c -> System.out.print(c));
		for(char c:ch1) {
			System.out.println(c);
		}
	}

}
