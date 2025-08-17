package Patterns;

import java.util.Scanner;

public class Pro15 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows:");
		int n=sc.nextInt();
		System.out.println("Enter the character:");
		char ch=sc.next().charAt(0);
		
		if(!Character.isLetter(ch)) {
			System.out.println("Enter a valid charcter!!!");
			return;
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)(ch+i));
			}
			System.out.println();
		}
	}
}
