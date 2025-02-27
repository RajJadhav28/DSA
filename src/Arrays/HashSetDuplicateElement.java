package Arrays;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetDuplicateElement {
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
		HashSet<Integer> duplicateElements=new HashSet<Integer>();
		 HashSet<Integer> allElements = new HashSet<>();
		int duplicate=0;
		
		for(int num:arr) {
			if(!allElements.add(num)) {
				duplicate++;
				duplicateElements.add(num);
				uniqueElements.remove(num);
			}else {
				uniqueElements.add(num);
			}
		}
		System.out.println("No. of Duplicate elements:"+duplicate);
		System.out.println("Duplicate elements:"+duplicateElements);
		System.out.println("Unique Elements:"+uniqueElements);
		System.out.println("After removing duplicate elements:"+allElements);
		sc.close();
	}
}
