package String1;

public class Pro5 {
	public static void main(String[] args) {
		String s1="Javatpoint";
		String s2="Welcome to split world";
		System.out.println("Returning words:");
		String arr[]=s1.split("t",0);
		for(String w:arr) {
			System.out.println(w);
		}
		//Uses format specifiers like %s (string), %d (integer), %f (float).
		System.out.println("Split array length:"+arr.length);
		String arr1[]=s2.split("\\s",2);
		for(String w:arr1) {
			System.out.println(w);
		}
	}
}
