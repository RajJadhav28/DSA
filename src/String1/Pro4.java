package String1;

public class Pro4 {
	public static void main(String[] args) {
		String s1="Welcome to world!!!";
		System.out.println(s1.length());
		char ch[]=s1.toCharArray();
		System.out.println(ch);
		int length=ch.length;
		System.out.println(length);
		for(char c:ch) {
			System.out.print(c);
		}
		for(int i=0;i<length;i++) {
			System.out.print(ch[i]);
		}
	}
}
