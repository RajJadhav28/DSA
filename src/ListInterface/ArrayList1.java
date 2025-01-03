package ListInterface;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Ajay");
		System.out.println("Initial elements:"+al);
		al.add("Rahul");
		System.out.println(al);
		al.add(1,"Gaurav");
		System.out.println(al);
		ArrayList<String>al2=new ArrayList<String>();
		al2.add("Sonoo");
		al2.add("Hanumant");
		//adding second list element to first
		al.addAll(al2);
		System.out.println("Added second list element to first:"+al);
		ArrayList<String>al3=new  ArrayList<String>(al2);
		al.addAll(1,al3);
		System.out.println(al);
		
		
	}

}
