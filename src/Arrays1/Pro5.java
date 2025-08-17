package Arrays1;

import java.util.Scanner;

public class Pro5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		int arr[]=new int[n];int flag=0;
		System.out.println("Enter the array elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element to be searched:");
		int t=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(t==arr[i]) {
				flag=1;
				System.out.println("Element "+t+" found at position "+i);
				break;
			}
		}
		if(flag==0) {
			System.out.println("Element "+t+" not found!!!");
		}
	}
}
