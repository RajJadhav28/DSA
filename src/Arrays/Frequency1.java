package Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Frequency1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		Map<Integer, Integer> frequency=new HashMap<Integer, Integer>();
		for(int num:arr) {
			frequency.put(num,frequency.getOrDefault(num, 0)+1 );
		}
		System.out.println("Frequency of elements:");
		for(Map.Entry entry:frequency.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		sc.close();
	}
}
