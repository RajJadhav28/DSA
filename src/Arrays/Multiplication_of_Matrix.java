package Arrays;

import java.util.Scanner;

public class Multiplication_of_Matrix {
	public static int[][] multiplyarray(int arr[][], int brr[][], int n, int m, int p){
		int crr[][]=new int[n][p];
		for(int i=0;i<n;i++) {
			for(int j=0;j<p;j++) {
				crr[i][j]=0;
				for(int k=0;k<arr[i].length;k++) {
					crr[i][j]=crr[i][j]+arr[i][k]*brr[k][j];
				}
			}
		}
	return crr;	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int n=sc.nextInt();
		System.out.println("Enter the number of columns of first matrix:");
		int m=sc.nextInt();
		System.out.println("Enter the number of columns of second matrix:");
		int p=sc.nextInt();
		int arr[][]=new int[n][m];
		int brr[][]=new int[m][p];
		
		System.out.println("Enter the values of first matrix:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the values of second matrix:");
		for(int i=0;i<m;i++) {
			for(int j=0;j<p;j++) {
				brr[i][j]=sc.nextInt();
			}
		}
		int result[][]=multiplyarray(arr, brr, n, m,p);
		System.out.println("Resultant Matrix:");
		for(int i=0;i<result.length;i++) {
			for(int j=0;j<result[i].length;j++) {
			System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
