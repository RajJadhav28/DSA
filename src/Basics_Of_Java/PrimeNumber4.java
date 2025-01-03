package Basics_Of_Java;

import java.util.Scanner;

public class PrimeNumber4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		System.out.println("Prime number:");
		for(int i=1;i<=n;i++) {
			int c=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					c++;
				}
			}
			if(c==2) {
				System.out.println(i);
			}
//			else {
//				System.out.println("Not a Prime number:"+i);
//			}
		}
		System.out.println("Not a Prime number:");
		for(int i=1;i<=n;i++) {
			int c=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					c++;
				}
			}
			if(c!=2) {
				System.out.println(i);
			}
//			else {
//				System.out.println("Not a Prime number:"+i);
//			}
		}
		sc.close();
	}

}
