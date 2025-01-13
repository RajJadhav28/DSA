package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
	int rollno,age;
	String name;
	Student(int rollno, int age, String name){
		this.rollno=rollno;
		this.age=age;
		this.name=name;
	}
}
class Agecomparator implements Comparator<Student>{
	public int compare(Student s1, Student s2) {
		if(s1.age==s2.age) {
			return 0;
		}else if(s1.age>s2.age) {
			return 1;
		}else {
			return -1;
		}
	}
}
class NameComparator implements Comparator<Student>{
	public int compare(Student s1, Student s2) {
		return s1.name.compareTo(s2.name);
	}
}
public class Pro1 {
	public static void main(String[] args) {
		ArrayList<Student>al=new ArrayList<Student>();
		al.add(new Student(101,25,"Raj"));
		al.add(new Student(102,26,"Jay"));
		al.add(new Student(103,27,"Harry"));
		System.out.println("Name Comparator:");
		Collections.sort(al, new NameComparator());
		al.forEach(a->{
			System.out.println(a.age+" "+a.rollno+" "+a.name);
		});
		System.out.println("Age Comparator:");
		Collections.sort(al, new Agecomparator());
		al.forEach(a->{
			System.out.println(a.age+" "+a.rollno+" "+a.name);
		});
	}
}
