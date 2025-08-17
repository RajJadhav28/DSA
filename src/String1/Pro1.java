package String1;

public class Pro1 {
	public static void main(String[] args) {
		String s1="java";
		char ch[]= {'s','t','r','i','n','g'};
		String s2=new String(ch);// converting char array to String
		System.out.println(s2);
		String s3=new String("Example");
		System.out.println(s3);
		System.out.println(s1);
		
		s1=s1.concat(s2).concat(s3);
		System.out.println(s1);
		
	}
}
