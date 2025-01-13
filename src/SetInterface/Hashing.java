package SetInterface;

import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
	public static void main(String[] args) {
		//Creating
		HashSet<Integer> set=new HashSet<Integer>();
		//Insert
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(1);
		//Size
		System.out.println("Size of set:"+set.size());
		
		System.out.println("Set:"+set);
		System.out.println("Using forEach loop:");
		set.forEach(a->{
			System.out.println(a);
		});
		System.out.println("Using Iterator:");
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//Search -contains
		if(set.contains(1)) {
			System.out.println("set conatins 1");
		}
		if(!set.contains(6)) {
			System.out.println("Does not conatins 6");
		}
		//Delete
		set.remove(1);
		if(!set.contains(1)) {
			System.out.println("Does not conatins 1");
		}
	}

}
