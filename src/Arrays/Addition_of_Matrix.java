package Arrays;

import java.util.Scanner;

public class Addition_of_Matrix {
	public static int[][] addmatrix(int arr[][],int arr1[][], int n, int m) {
		if(arr.length!=n||arr[0].length!=m||arr1.length!=n||arr1[0].length!=m) {
			throw new IllegalArgumentException("Matrix dimension does not match");
		}
		int crr[][]=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				crr[i][j]=arr[i][j]+arr1[i][j];
			}
		}
		return crr;
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int n=sc.nextInt();
		System.out.println("Enter the number of columns:");
		int m=sc.nextInt();
		int arr[][]=new int[n][m];
		int arr1[][]=new int[n][m];
		System.out.println("Enter the values of 1st matrix:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the values of 2nd matrix:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr1[i][j]=sc.nextInt();
			}
		}
		int result[][]=addmatrix(arr, arr1, n, m);
		System.out.println("Resultant Matrix:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
