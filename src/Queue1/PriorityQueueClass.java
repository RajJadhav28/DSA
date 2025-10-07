package Queue1;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueClass {
	public static void main(String[] args) {
		PriorityQueue<String> q=new PriorityQueue<String>();
		q.add("Amit");
		q.add("Vijay");
		q.add("Karan");
		q.add("Jay");
		q.add("Rahul");
		System.out.println("head:"+q.element());
		System.out.println("head:"+q.peek());
		System.out.println("After using forEach loop:");
		q.forEach(a->{
			System.out.println(a);
		});
		System.out.println("After using iterator:");
		Iterator<String>itr=q.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//Removing the head of the queue
		System.out.println("head of the queue:"+q.peek());
		q.remove();
		System.out.println("After using remove head:"+q);
		System.out.println("Printing the elements after removing the head using forEach loop:");
		q.forEach(a->{
			System.out.println(a);
		});
		System.out.println("Printing the elements after removing the head using Iteration:");
		Iterator<String>itr1=q.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println("After removing 2nd element and using forEach loop to display:");
		q.poll();
		Iterator<String>itr2=q.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}
}
