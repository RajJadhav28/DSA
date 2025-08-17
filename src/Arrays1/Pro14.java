package Arrays1;

import java.util.Scanner;

public class Pro14 {
	public static int Highest(int arr[], int total) {
		int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				secondLargest=largest;
				largest=arr[i];
			}else if(arr[i]>secondLargest && arr[i]!=largest) {
				secondLargest=arr[i];
			}
		}
		return largest;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array length:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int result=Highest(arr, n);
		System.out.println("Highest element:"+result);
		sc.close();
	}
}
