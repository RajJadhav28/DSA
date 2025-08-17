package String1;

public class Pro11 {
	public static void main(String[] args) {
		String str="ABCDEF";
		byte barr[]=str.getBytes();
		for(int i=0;i<barr.length;i++) {
			System.out.println(barr[i]);
		}
		String s1="This is indexOf method";
		//Passing Substring
		int index=s1.indexOf("method");
		System.out.println("Index of substring:"+index);
		
		String s2="this is index of example"; 
		//passing substring
		int index1=s2.indexOf("is");
		int index2=s2.indexOf("index");
		System.out.println(index2);
		}
}
