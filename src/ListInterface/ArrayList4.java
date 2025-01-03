package ListInterface;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList4 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		al.add("Jason");
		System.out.println("An initial list of elements:"+al);
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Using for loop:");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		System.out.println("using foreach loop with lambda expression:");
		al.forEach(a->{
			System.out.println(a);
		});
		al.remove("Vijay");
		System.out.println("After removing elements using iterator:");
		Iterator itr1=al.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println("After removing element using foreach and lambda expression:");
		al.forEach(a->{
			System.out.println(a);
		});
		System.out.println("After removing element using remove if using foreach and lambda expression:");
		al.removeIf(str->str.contains("Ravi"));
		al.forEach(a->{
			System.out.println(a);
		});
		System.out.println("After removing element using remove if using iterator and lambda expression:");

		Iterator itr2=al.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		System.out.println("second Arraylist");
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("Mr.");
		al2.add("Ms.");
		al2.add("Dr.");
		al2.add("Prof.");
		Iterator itr3=al2.iterator();
		al2.forEach(a->{
			System.out.println(a);
		});
		System.out.println("Using iterator");
		while(itr3.hasNext()) {
			System.out.println(itr3.next());
		}
		System.out.println("Using addAll");
		al.addAll(al2);
		al.forEach(a->{
			System.out.println(a);
		});
		System.out.println(al.subList(1, 3));
		al.set(1, "Pooja");
		System.out.println(al);
		Iterator itr4=al.iterator();
		while(itr4.hasNext()) {
			System.out.println(itr4.next());
		}
		al.forEach(a->{
			System.out.println(a);
		});
		System.out.println(al);
		System.out.println("Cloned array:");
		ArrayList<String> al5=(ArrayList<String>)al.clone();
		Iterator itr5=al5.iterator();
		while(itr5.hasNext()) {
			System.out.println(itr5.next());
		}
		System.out.println("Cloned array using forEach loop:");
		al5.forEach(a->{
			System.out.println(a);
		});
	}

}
