package Basics_Of_Java;

import java.util.Scanner;

public class Armstrong_no {
	
	public static void main(String[] args) {
		int sum = 0, rem ;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number to check:");
		int num=sc.nextInt();
		int temp=num;
		while(num>0) {
			rem=num%10;
			sum=sum+rem*rem*rem;
			num=num/10;
		}
		if(temp==sum) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		sc.close();
	}

}
