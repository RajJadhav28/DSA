package String1;

import java.util.Scanner;

public class Pro17 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of String array:");
		int n=sc.nextInt();
		String arr[]=new String[n];
		System.out.println("Enter the String Array elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.next().toLowerCase();
		}
		System.out.println("Enter the character to be searched:");
		char searchChar=sc.next().toLowerCase().charAt(0);
		boolean found=false;
		
//		for(String s1:arr) {
//			if(s1.charAt(0)==searchChar) {
//				System.out.println(s1);
//				found=true;
//			}
//		}
		for(int i=0;i<arr.length;i++) {
			String s1=arr[i];
			if(!s1.isEmpty() && s1.charAt(0)==searchChar) {
				System.out.println("String:"+s1+" at position:"+(i+1));
				found=true;
			}
		}
		if(!found) {
			System.out.println("No strings found starting with '" + searchChar + "'");
		}
	}
}
