package Arrays1;

import java.util.Scanner;

public class Pro4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Original Array:");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println("\nPrinting the clone array:");
		int carr[]=arr.clone();
		for(int i:carr) {
			System.out.print(i+" ");
		}
		sc.close();
	}
}
