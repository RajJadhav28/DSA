package String1;

public class Pro2 {
	public static void main(String[] args) {
		String s1="Yuvraj";//Stored in constant pool
		String s2=new String("Yuvraj");//Stored in Heap memory
		String s3="Yuvraj";
		String s4="YUVRAJ";
		String s5="Ratan";
		System.out.println("s1:"+s1);
		System.out.println("s2:"+s2);
		System.out.println("s3:"+s2);
		System.out.println("s4:"+s4);
		System.out.println("s5:"+s5);
		System.out.println("s1==s2:"+(s1==s2));
		System.out.println("s1==s3:"+(s1==s3));
		System.out.println("s1==s4:"+(s1==s4));
		
		System.out.println("s2:"+s2);
		String s6=new String("Yuvraj");
		System.out.println("s6:"+s6);
		System.out.println("s1.equals(s2):"+(s1.equals(s2)));
		System.out.println("s1.equals(s3):"+(s1.equals(s3)));
		System.out.println("s1.equals(s4):"+(s1.equals(s4)));
		System.out.println("s1.equalsIgnoreCase(s4):"+(s1.equalsIgnoreCase(s4)));
		System.out.println("s1.compareTo(s2):"+(s1.compareTo(s2)));
		System.out.println("s1.compareTo(s3):"+(s1.compareTo(s3)));
		System.out.println("s1.compareTo(s4):"+(s1.compareTo(s4)));
		System.out.println("s1.compareTo(s5):"+(s1.compareTo(s5)));
	}
}
