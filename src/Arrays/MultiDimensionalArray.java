package Arrays;

import java.util.Scanner;

public class MultiDimensionalArray {
	public static void multidimensional(int arr[][]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print("arr["+i+"]["+j+"]="+arr[i][j]+", ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number(size) of rows and columns:");
		int i=sc.nextInt();
		int arr[][]=new int[i][i];
		System.out.println("Enter the array elements:");
		for(int k=0;k<arr.length;k++) {
			for(int l=0;l<arr[k].length;l++) {
				arr[k][l]=sc.nextInt();
			}
		}
		System.out.println("Multidimensional Array:");
		multidimensional(arr);
		sc.close();
	}

}
