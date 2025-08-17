package String1;

import java.util.Arrays;

public class Pro8 {
	public static void main(String[] args) {
		String s1="Welcome to split world.";
		System.out.println("returning words:");
		Arrays.stream(s1.split("\\s",0)).forEach(a->{
			System.out.println(a);
		});
		Arrays.stream(s1.split("\\s",1)).forEach(a->{
			System.out.println(a);
		});
		Arrays.stream(s1.split("\\s",2)).forEach(a->{
			System.out.println(a);
		});
		String s2="Javatpoint";
		Arrays.stream(s2.split("t",0)).forEach(a->{
			System.out.println(a);
		});
	}
}
