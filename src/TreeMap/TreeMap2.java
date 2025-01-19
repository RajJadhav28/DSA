package TreeMap;

import java.util.TreeMap;

class Book{
	int id, rollno,quantity;
	String SubName,Author;
	
	Book(int id, int rollno, int quantity, String SubName,String Author){
		this.id=id;
		this.rollno=rollno;
		this.quantity=quantity;
		this.SubName=SubName;
		this.Author=Author;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", rollno=" + rollno + ", quantity=" + quantity + ", SubName=" + SubName + ", Author="
				+ Author + "]";
	}
	
}
public class TreeMap2 {

	public static void main(String[] args) {
		Book b=new Book(1, 101, 2, "Java", "Raj");
		TreeMap<Integer, Book> map=new TreeMap<Integer, Book>();
		map.put(1, b);
		map.forEach((Key,Value)->{
			System.out.println(Key+":"+Value);
		});
		

	}

}
