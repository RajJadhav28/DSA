package ListInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList2 {

	public static void main(String[] args) {
		System.out.println("printing arraylist1:");
		ArrayList<Integer> li=new ArrayList<Integer>(5);
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(40);
		li.add(60);
		for(Integer num:li) {
			System.out.println("Number:"+num);
		}
		System.out.println("Printing second arrayList:");
		ArrayList<Integer>li2=new ArrayList<Integer>();
		li2.add(25);
		li2.add(35);
		li2.add(45);
		li2.add(55);
		for(Integer num:li2) {
			System.out.println("Number:"+num);
		}
		System.out.println("Printing all elements:");
		Iterator itr=li2.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		ArrayList<Integer>li3=new ArrayList<Integer>();
		li3.add(1);
		li3.add(2);
		li3.add(3);
		li3.add(4);
		li3.add(5);
		System.out.println("Initial elements:"+li3);
		li3.clear();
		System.out.println("After clearing the elements:"+li3);
		li2.set(1, 15);
		System.out.println("After replacing the element at 1st position:");
		for(Integer n:li2) {
			System.out.println(n);
		}
		System.out.println("After sorting second list elements:");
		Collections.sort(li2);
		for(Integer n:li2) {
			System.out.println(n);
		}

	}

}
