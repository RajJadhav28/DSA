package Basics_Of_Java;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int flag=0;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("Prime no.");
		}else {
			System.out.println("Not a prime no.");
		}

	}

}
