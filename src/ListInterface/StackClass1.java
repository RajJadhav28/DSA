package ListInterface;

import java.util.Iterator;
import java.util.Stack;

public class StackClass1 {

	public static void main(String[] args) {
		Stack<String>a=new Stack<String>();
		a.push("Dog");
		a.push("Cat");
		a.push("Lion");
		a.push("Tiger");
		System.out.println("Animal-Stack:"+a);
		System.out.println(a.pop());
		System.out.println(a);
		String element=a.pop();
		System.out.println("Remove element:"+element);
		System.out.println("Top element of the stack:"+a.peek());
		System.out.println("Elements of the stack:"+a);
		a.push("Lion");
		a.push("Tiger");
		System.out.println("Stack:"+a);
		System.out.println("After using forEach:");
		a.forEach(a1->{
			System.out.println(a1);
		});
		System.out.println("After using iterator:");
		Iterator itr=a.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		int position=a.search("Lion");
		System.out.println("Position of lion:"+position);
		boolean result=a.empty();
		System.out.println("Is stack empty?:"+result);
		}

}
