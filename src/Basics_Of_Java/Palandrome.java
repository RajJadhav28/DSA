package Basics_Of_Java;

import java.util.Scanner;

public class Palandrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rem, sum=0, num;
		System.out.println("Enter the number to check:");
		 num=sc.nextInt();
		 int temp=num;
		while(num>0) {
			rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		}
		if(temp==sum) {
			System.out.println("Its a palandrome");
		}else {
			System.out.println("Not a palandrome.");
		}
		sc.close();
	}

}
