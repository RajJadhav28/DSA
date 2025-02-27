package Strings;

import java.util.Scanner;

public class Pro8 {
	public static String palandrome(String v) {
		String rev="";
		for(int i=v.length()-1;i>=0;i--) {
			rev=rev+v.charAt(i);
		}
		return rev;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		String v=sc.next();
		v=v.toLowerCase();
		String result=palandrome(v);
		if(v.equals(result)) {
			System.out.println(v+" is a palandrome");
		}else {
			System.out.println(v+" not a palandrome");
		}
		sc.close();
	}

}
