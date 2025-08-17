package Arrays;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicate11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		HashSet<Integer> uniqueElements=new HashSet<Integer>();
		int j=0;
		for(int num:arr) {
			uniqueElements.add(num);
		}
		for(int num:uniqueElements) {
			arr[j++]=num;
		}
		System.out.println("Unique elements:"+uniqueElements);
		System.out.println("No of unique elements:"+j);
		sc.close();
	}
}
