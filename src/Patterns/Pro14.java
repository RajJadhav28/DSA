package Patterns;

import java.util.Scanner;

public class Pro14 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value");
		int n=sc.nextInt();
		
		System.out.println("Enter the starting character (A-Z or a-z):");
		char starterchar=sc.next().charAt(0);
		
		if(!Character.isLetter(starterchar)) {
			System.out.println("Invalid input. Please enter a valid letter (A-Z or a-z).");
			return;
		}
		
		for(int i=0;i<=n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print((char)(starterchar+ j));
			}
			System.out.println();
		}
	}
}
