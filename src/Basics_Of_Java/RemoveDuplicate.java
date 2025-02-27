package Basics_Of_Java;

import java.util.Scanner;

public class RemoveDuplicate {
	public static int removeduplicate(int num[]) {
		if(num.length==0) {
			return 0;
		}
		int j=1;
		for(int i=0;i<num.length-1;i++) {
			if(num[i]!=num[i+1]) {
				num[j]=num[i+1];
				j++;
			}
		}
		return j;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		int num[]=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++) {
			 num[i]=sc.nextInt();
		}
		int removelength=removeduplicate(num);
		System.out.println("After removing duplicate:");
		for(int i=0;i<removelength;i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
		sc.close();
		
	}
}
