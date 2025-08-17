package Strings;

import java.util.Scanner;

public class Pro10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=sc.nextLine();
		
		String words[]=s.split(" ");
		
		for(int i=0;i<words.length/2;i++) {
			String temp=words[i];
			words[i]=words[words.length-1-i];
			words[words.length-1-i]=temp;
		}
		for(int i=words.length;i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print(words[j]);
				if(j!=i-1) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
