package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CloneArray {
	public static void orignalarray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
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
		orignalarray(arr);
		int crr[]=arr.clone();
		System.out.println("\nCloned array:");
		Arrays.stream(crr).forEach(a->{
			System.out.print(a+" ");
		});
		sc.close();
	}

}
