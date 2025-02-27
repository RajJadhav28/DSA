package Arrays;

import java.util.Scanner;

public class RemoveElement {
	public int removeElement(int arr[], int val) {
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=val) {
				arr[index]=arr[i];
				index++;
			}
		}
		return index;
	}
	public static void main(String[] args) {
		RemoveElement r=new RemoveElement();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element to remove:");
		int val=sc.nextInt();
		int result=r.removeElement(arr, val);
		for(int i=0;i<result;i++) {
			System.out.println(arr[i]);
		}
		sc.close();
	}
}
