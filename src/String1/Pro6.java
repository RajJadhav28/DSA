package String1;

import java.util.Arrays;

public class Pro6 {
	public static void main(String[] args) {
		String s="Sachin Tendulkar";
		System.out.println("Original String:"+s);
		System.out.println(s.substring(6));
		System.out.println(s.substring(0,6));
		
		String text=new String("Hello , My name is Khan");
		String sentences[]=text.split("\\2");
		System.out.println(Arrays.toString(sentences));
		
		String sentences2[]=text.split("\\s",2);
		for(String w:sentences2) {
			System.out.println(w);
		}
		String s1="Javatpoint";
		String arr1[]=s1.split("t",2);
		for(String w:arr1) {
			System.out.println(w);
		}
		char ch1[]=new char[6];
		text.getChars(0, 6, ch1, 0);
		for(char c:ch1) {
			System.out.print(c);
		}
	}
}
