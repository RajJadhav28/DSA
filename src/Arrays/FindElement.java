package Arrays;

import java.util.Scanner;

public class FindElement {

	public static int findelement(int arr[], int t) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==t) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		if(n<=0) {
			System.out.println("Size must be greater than zero.");
			return;
		}
		int arr[]=new int[n];
		System.out.println("Enter the array element:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element to be searched:");
		int t=sc.nextInt();
		int result=findelement(arr, t);
		if(result==-1) {
			System.out.println("Element not found!!!");
		}else {
			System.out.println("Element present at index:"+result+" position.");
		}
		sc.close();
	}

}
