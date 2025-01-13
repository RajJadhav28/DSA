package SetInterface;

import java.util.LinkedHashSet;
import java.util.Scanner;

class Book{
	int id;
	String name, author, publisher;
	int quantity;
	public Book(int id, String name,String author, String publisher, int quantity) {
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
	}
}
public class LinkedHashSetClass2 {
	public static void main(String[] args) {
		String x;
		do {
		Scanner sc=new Scanner(System.in);
		
		LinkedHashSet<Book> set=new LinkedHashSet();
		System.out.println("Enter the id:");
		int id=sc.nextInt();
		System.out.println("Enter the name:");
		String name=sc.next();
		System.out.println("Enter the author:");
		String author=sc.next();
		System.out.println("Enter the publisher:");
		String publisher=sc.next();
		System.out.println("Enter the quantity:");
		int quantity=sc.nextInt();
//		Book b=new Book( id, name, author, publisher, quantity);//method 1
//		set.add(b);
//		for(Book a:set) {
//			System.out.println("Id:"+a.id+"\nName:"+a.name+"\nAuthor:"+a.author+"\nPublisher:"+a.publisher+"\nQuantity:"+a.quantity);
//		}
		set.add(new Book(id,name,author,publisher,quantity));//method 2
		set.forEach(a->{
			System.out.println("Id:"+a.id+"\nName:"+a.name+"\nAuthor:"+a.author+"\nPublisher:"+a.publisher+"\nQuantity:"+a.quantity);
		});
		
		System.out.println("Do you wish to continue\nEnter Yes to continue and No to discontinue:");
			x=sc.next();
			x=x.toLowerCase();
		}while(x.equals("yes"));
		System.out.println("Thank you!!!");
	}

}
