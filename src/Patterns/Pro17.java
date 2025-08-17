package Patterns;

import java.util.Scanner;

public class Pro17 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=sc.nextInt();
		System.out.println("Enter the character:");
		char ch=sc.next().charAt(0);
		if(!Character.isLetter(ch)) {
			System.out.println("Enter a valid character!!!");
			return;
		}
		for(int i=n-1;i>=0;i--) {
			for(int j=0;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=i;j>=0;j--) {
				System.out.print((char)(ch+j));
			}
			System.out.println();
		}
		sc.close();
	}
}
