package Arrays1;

import java.util.HashSet;
import java.util.Scanner;

public class Pro10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int duplicate=0;
		HashSet<Integer> uniqueElements=new HashSet<Integer>();
		HashSet<Integer>duplicateElements=new HashSet<Integer>();
		HashSet<Integer>allElements=new HashSet<Integer>();
		
		for(int num:arr) {
			if(!allElements.add(num)) {
				duplicateElements.add(num);
				duplicate++;
				uniqueElements.remove(num);
			}else {
				uniqueElements.add(num);
			}
		}
		System.out.println("All Elements:"+allElements);
		System.out.println("Duplicate Elements:"+duplicateElements);
		System.out.println("Unique Elements:"+uniqueElements);
		System.out.println("No.of duplicate elements:"+duplicate);
	}
}
