package Basics_Of_Java;

import java.util.Scanner;

public class fibonacci_series {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of number:");
		int num=sc.nextInt();
		int num1=0, num2=1, num3;
		System.out.println(num1);
		System.out.println(num2);
		for(int i=1;i<=num;i++) {
			num3=num1+num2;
			num1=num2;
			num2=num3;
			System.out.println(num3+" ");
		}
		
		sc.close();

	}

}
