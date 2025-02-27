package Strings;

public class Pro6 {
	public static void main(String[] args) {
		String s="What is javatpoint used for";
		char ch[]=new char[15];
		try {
			s.getChars(5, 15, ch, 0);
			System.out.println(ch);
		}catch(Exception e) {
			System.out.println(e);
		}
		int index=s.indexOf("javatpoint");
		System.out.println("Index of substring:"+index);
	}
}
