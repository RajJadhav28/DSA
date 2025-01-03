package Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class Book{
	int id, quantity;
	String name, auther, publisher;
	public Book(int id, int quantity, String name, String auther, String publisher) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.name = name;
		this.auther = auther;
		this.publisher = publisher;
	}
}
public class ArrayDequeExample {
	public static void main(String[] args) {
		int x;
		do {
		Scanner sc=new Scanner(System.in);
		Deque<Book> q=new ArrayDeque<Book>();
		System.out.println("Enter the id:");
		int id=sc.nextInt();
		System.out.println("Enter the quantity:");
		int quantity=sc.nextInt();
		System.out.println("Enter the name:");
		String name=sc.next();
		System.out.println("Enter the author:");
		String author=sc.next();
		System.out.println("Enter the publisher:");
		String publisher=sc.next();
		
		Book b=new Book(id, quantity, name, author, publisher);
		q.add(b);
		q.forEach(a->{
			System.out.println("---------------------------------------");
			System.out.println("id: "+a.id+"\nquantity: "+a.quantity+"\nname: "+a.name+"\nauthor: "+a.auther+"\npublisher: "+a.publisher);
		});
		System.out.println("===========================");
		System.out.println("Do you want to continue:");
		System.out.println("Enter 1 to continue 0  to stop:");
		x=sc.nextInt();
		}while(x==1);
		System.out.println("Thank you for visiting.");
	}

}
