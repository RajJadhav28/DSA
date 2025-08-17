package String1;

import java.util.Scanner;

public class Pro12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=sc.next();
		s=s.toLowerCase();
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.print(s+"-->");
		if(s.equals(rev)) {
			System.out.print("It's a Palandrome");
		}else {
			System.out.print("Not a palandrome");
		}
	}
}
