package Comparable;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{
	
	int rollno, age;
	String name;
	Student(int rollno, String name, int age){
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
	@Override
	public int compareTo(Student st) {
		if(age==st.age) {
			return 0;
		}else if(age>st.age) {
			return 1;
		}else {
			return -1;
		}
	}
}
public class Pro1 {
	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student(101,"Vijay",23));
		al.add(new Student(102,"Ajay",24));
		al.add(new Student(103, "Ramesh", 26));
		Collections.sort(al);
		al.forEach(a->{
			System.out.println(a.rollno+" "+a.name+" "+a.age);
		});
	}

}
