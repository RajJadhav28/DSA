package Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueClass2 {

	public static void main(String[] args) {
		Queue<Integer> q=new PriorityQueue<Integer>();
		q.add(10);
		q.add(8);
		q.add(3);
		q.add(7);
		q.add(2);
		q.add(1);
		System.out.println(q);

	}

}
