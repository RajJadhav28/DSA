package Comparable;

import java.util.ArrayList;
import java.util.Collections;

class Student1 implements Comparable<Student1>{
	int rollno, age;
	String name;
	Student1(int roll, int age, String name){
		this.rollno=roll;
		this.age=age;
		this.name=name;
	}
	public int compareTo(Student1 st) {
		if(age>st.age) {
			return 1;
		}else if(age<st.age) {
			return -1;
		}else {
			return 0;
		}
	}
}
public class Pro2 {
	public static void main(String[] args) {
		ArrayList<Student1> al=new ArrayList<Student1>();
		Student1 st=new Student1(12, 18, "Raj");
		Student1 st1=new Student1(13, 17, "jay");
		Student1 st2=new Student1(14, 20, "Rajveer");
		al.add(st);
		al.add(st1);
		al.add(st2);
		Collections.sort(al);
		al.forEach(a->{
			System.out.println(a.rollno+" "+a.age+" "+a.name);
		});
	}
}
