package Arrays1;

import java.util.Scanner;

public class Pro2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("Enter the length of row:");
		int n=sc.nextInt();
		System.out.println("Enter the length of column:");
		int m=sc.nextInt();
		int arr[][]=new int[n][m];
		int brr[][]=new int[n][m];
		int crr[][]=new int[n][m];
		System.out.println("Enter the array elements of 1st array:");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
			arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the array elements of 2nd array:");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
			brr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
			crr[i][j]=arr[i][j]+brr[i][j];
		}
	  }
		
		System.out.println("C=");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
			System.out.print(crr[i][j]+" ");
		}
			System.out.println();
	  }
		
		}catch(Exception e) {
			System.out.println("Enter a valid number!!!");
		}
		
		sc.close();
	}
}
