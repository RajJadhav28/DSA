package String1;

public class Pro9 {
	public static void main(String[] args) {
		String name="What do u know about me";
		System.out.println(name.contains("do u know"));
		System.out.println(name.contains("about me"));
		System.out.println(name.contains("What  to"));
		boolean isContains=name.contains("What do u");
		System.out.println(isContains);
		
		String str="ABCDEF";
		byte barr[]=str.getBytes();
		for(int i=0;i<barr.length;i++) {
			System.out.println(barr[i]);
		}
		
		String s1="This is indexOf method";
		
		int index=s1.indexOf("method");
		System.out.println("index of substring: "+index);
	}
}
