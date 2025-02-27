package Strings;

import java.util.Scanner;

public class Pro9 {
	public static int charvalues(String ch, int c) {
		
		for(int i=0;i<=ch.length()-1;i++) {
			if(ch.charAt(i)!=' ') {
				c++;
			}
		}
		return c;
	}
	public static int spaces(String ch, int c) {
		for(int i=0;i<ch.length()-1;i++) {
			ch=ch.trim();
			if(ch.charAt(i)==' ') {
				c++;
			}
		}
		return c;
	}
	public static int words(String ch, int c) {
		String[] words=ch.trim().split("\\s+");
		 c=words.length;
		return c;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the char values:");
		String ch=sc.nextLine();int c=0;
		int result=charvalues(ch, c);
		System.out.println("Total number of char values:"+result);
		int result1=spaces(ch, c);
		System.out.println("Total number of spaces:"+result1);
		int result2= words(ch, c);
		System.out.println("Total number of words:"+result2);
	}
}
