package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student11{
	int rollno,age;
	String name;
	Student11(int rollno, int age, String name){
		this.rollno=rollno;
		this.age=age;
		this.name=name;
	}
}
class AgeComparator1 implements Comparator<Student11>{
	public int compare(Student11 s1, Student11 s2) {
		if(s1.age>s2.age) {
			return 1;
		}else if(s1.age<s2.age) {
			return -1;
		}else {
			return 0;
		}
	}
}
class NameComparator1 implements Comparator<Student11>{
	public int compare(Student11 s1, Student11 s2) {
		return s1.name.compareTo(s2.name);
	}
}
public class Pro2 {
	public static void main(String[] args) {
		ArrayList<Student11>al=new ArrayList<Student11>();
		al.add(new Student11(101,25,"Raj"));
		al.add(new Student11(102,26,"Jay"));
		al.add(new Student11(103,27,"Harry"));
		System.out.println("Name Comparator:");
		Collections.sort(al, new AgeComparator1());
		al.forEach(a->{
			System.out.println(a.age+" "+a.rollno+" "+a.name);
		});
		System.out.println("Age Comparator:");
		Collections.sort(al, new NameComparator1());
		al.forEach(a->{
			System.out.println(a.age+" "+a.rollno+" "+a.name);
		});
	}
}
