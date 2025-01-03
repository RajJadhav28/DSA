package Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class ArrayDequeClass {

	public static void main(String[] args) {
		Deque<String> q=new  ArrayDeque<String>();
		q.add("Ravi");
		q.add("Vijay");
		q.add("Ajay");
		q.forEach(a->{
			System.out.println(a);
		});
		q.pollLast();
		System.out.println("After removing last element:");
		q.forEach(a->{
			System.out.println(a);
		});
		System.out.println("After removing first element:");
		q.pollFirst();
		q.forEach(a->{
			System.out.println(a);
		});
	}

}
