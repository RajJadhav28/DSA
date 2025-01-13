package MapInterface;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

class Book{
	int rollno,quantity;
	String name,author;
	
	public Book( int rollno, String name, String author, int quantity) {
		
		this.rollno=rollno;
		this.name=name;
		this.author=author;
		this.quantity=quantity;
	}
}
public class LinkedHashMapClass2 {
	public static void main(String[] args) {
		String x = null;
		do {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id:");
		int id=sc.nextInt();
		System.out.println("Enter the rollno:");
		int rollno=sc.nextInt();
		System.out.println("Enter the name:");
		String name=sc.next();
		System.out.println("Enter the author:");
		String author=sc.next();
		System.out.println("Enter the quantity:");
		int quantity=sc.nextInt();
		
		LinkedHashMap<Integer, Book>map=new LinkedHashMap<Integer, Book>();
//		Book b=new Book(rollno, name, author, quantity);//method 2
//		map.put(id, b);
		map.put(id, new Book(rollno, name, author, quantity));
		for(Map.Entry<Integer, Book>entry:map.entrySet()) {
			int key=entry.getKey();
			Book b=entry.getValue();
			System.out.println(key+" Details:");
			System.out.println("Rollno:"+b.rollno+"\nName:"+b.name+"\nAuthor:"+b.author+"\nQuantity:"+b.quantity);
			
			System.out.println("Do you want to continue\n Press y to continue n to discontinue.");
			x=sc.next();
			x=x.toLowerCase();
			
		}
		}while(x.equals("y"));
		System.out.println("Thank you!!!");
		
	}

}
