package Arrays;

import java.util.Scanner;

public class EvenOdd {
	public static void oddeven(int arr[]) {
		boolean hasEven=false, hasOdd=false;
		System.out.println("Even elements:");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
				hasEven=true;
			}
		}
		if(!hasEven) {
			System.out.println("No even elements found!!!");
		}
		System.out.println("Odd elements:");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				System.out.println(arr[i]);
				hasOdd=true;
			}
		}
		if(!hasOdd) {
			System.out.println("No Odd elements found");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		if(n<=0) {
			System.out.println("Element size cannot be less than zero!!!");
			return;
		}
		int arr[]=new int[n];
		
		System.out.println("Enter the array elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		oddeven(arr);
		sc.close();
	}
}
