package Patterns;

import java.util.Scanner;

public class Pro11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the char value:");
		char ch=sc.next().charAt(0);
		System.out.println("Enter the int value:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
	}
}
