package Basics_Of_Java;

import java.util.LinkedList;

public class Arrays {
	public static void main(String[] args) {
		LinkedList<Integer>li=new LinkedList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(45);
		System.out.println("After using forEach:");
		li.forEach(a->{
			System.out.println(a);
		});
		System.out.println("Even elements:");
		for(int i=0;i<li.size();i++) {
			if(li.get(i)%2==0) {
				System.out.println(li.get(i));
			}
		}
		System.out.println("Odd elements:");
		for(int i=0;i<li.size();i++) {
			if(li.get(i)%2!=0) {
				System.out.println(li.get(i));
			}
		}
		
		int arr[]= {1,2,3,1,4,5,6};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+i;
		}
		System.out.println("Sum of All:"+sum);
	}

}
