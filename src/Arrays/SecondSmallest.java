package Arrays;

import java.util.Scanner;

public class SecondSmallest {
	public static int secondsmallest(int arr[], int n) {
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr[1];
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements of array:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int result=secondsmallest(arr, n);
		System.out.println("Second smallest:"+result);
		sc.close();
	}

}
