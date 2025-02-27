package Strings;

import java.util.Scanner;

public class Pro7 {
	public static String num(String v) {
		
		String rev="";
		for(int i=v.length()-1;i>=0;i--) {
			rev=rev+v.charAt(i);
		}
		return rev;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String v=sc.next();
		String result=num(v);
		System.out.println(result);
	}

}
