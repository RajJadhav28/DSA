package Basics_Of_Java;

import java.util.Scanner;

public class JumpStatements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the value of rows:");
//		int row=sc.nextInt();
//		System.out.println("Enter the value of column:");
//		int column=sc.nextInt();
		for(int i=0;i<=5;i++) {
		//	for(int j=i;j<=5;j++) {
				if(i==4) {
					//continue;
					break;
				}
				System.out.println(i);
			//}
			//System.out.println();
		}

	}

}
