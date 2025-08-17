package Arrays1;

import java.util.Scanner;

public class Pro8 {
	public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		System.out.println("Enter the size of the String:");
		int  n=sc.nextInt();
		sc.nextLine();int flag=0;
		String s[]=new String[n];
		System.out.println("Enter the elements in the String:");
		for(int i=0;i<s.length;i++) {
			s[i]=sc.nextLine().toLowerCase();
		}
//		for(int i=0;i<s.length;i++) {
//			System.out.println(s[i]);
//		}
		System.out.println("Enter the character to be searched with:");
		char t=sc.nextLine().charAt(0);
		System.out.println("String starts with "+t+" are:");
		boolean found=false;
		for(int i=0;i<s.length;i++) {
			if(s[i].charAt(0)==Character.toLowerCase(t)) {
				System.out.println(s[i]);
				found=true;
				
			}
		}
		if(found==false) {
			System.out.println("Not found!!!");
		}
	}
}
