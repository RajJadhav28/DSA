package String1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pro15 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of String array:");
		int n=sc.nextInt();
		String arr[]=new String[n];
		System.out.println("Enter the String Array elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.next();
		}
		Map<String, Integer> frequency=new HashMap<String, Integer>();
		for(String frr:arr) {
			frequency.put(frr, frequency.getOrDefault(frr, 0)+1);
		}
		System.out.println("==========================");
		System.out.println("Frequency:");
		for(Map.Entry<String, Integer> entry:frequency.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		sc.close();
	}
}
