package String1;

import java.util.Scanner;

public class Pro16 {
	public static String[] wordcount(String s){
		String words[]=s.trim().split("\\s+");
		return words;
	}
	public static int charCount(String s) {
		int c=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				c++;
			}
		}
		return c;
	}
	public static int spaceCount(String s) {
		int c=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				c++;
			}
		}
		return c++;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=sc.nextLine();
		String wordCount[]=wordcount(s);
		System.out.println("No.of words:"+wordCount.length);
		int charCount=charCount(s);
		System.out.println("No.of characters:"+charCount);
		int spaceCount=spaceCount(s);
		System.out.println("No.of spaces:"+spaceCount);
	}
}
