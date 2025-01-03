package ListInterface;

import java.util.ArrayList;

public class ArrayList5 {

	public static void main(String[] args) throws Exception{
		ArrayList<String> li=new ArrayList<String>();
		li.add("Abhay");
		li.add("Bobby");
		li.add("Chand");
		li.add("Dev");
		li.add("Eravati");
		li.removeIf(n->(n.charAt(0)=='D'));
		li.forEach(a->{
			System.out.println(a);
		});
		ArrayList<Integer>li2=new ArrayList<Integer>();
		li2.add(23);
		li2.add(32);
		li2.add(45);
		li2.add(63);
		li2.add(35);
		li2.add(45);
		
		li2.removeIf(n->(n%3==0));
		System.out.println("Value divided by 3:");
		li2.forEach(a->{
			System.out.println(a);
		});
		ArrayList<Integer>li3=new ArrayList<Integer>();
		li3.add(23);
		li3.add(32);
		li3.add(45);
		li3.add(36);
		li3.add(53);
		li3.add(54);
		
		System.out.println("After retaining");
		li3.retainAll(li2);
		System.out.println(li3);
		li3.forEach(a->{
			System.out.println(a);
		});
	}
}


