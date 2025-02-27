package Strings;

public class Pro5 {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Hello");
		sb.append(" Java");//now original String is changed.
		System.out.println(sb);//new String "Hello Java" will be printed.
		sb.insert(1, "php");
		System.out.println(sb);
		
		StringBuffer sb1=new StringBuffer("Hello");
		sb1.replace(1, 3, "DotNet");
		System.out.println("Replace:"+sb1);
		
		sb1.delete(1, 3);
		System.out.println("Delete:"+sb1);
		
		sb1.reverse();
		System.out.println("Reverse:"+sb1);
		
		System.out.println("Capacity:"+sb1.capacity());
		sb1.append(sb);
		System.out.println(sb1);
		System.out.println(sb1.capacity());
		
		sb1.ensureCapacity(10);
		System.out.println(sb1.capacity());
		
		sb1.ensureCapacity(50);
		System.out.println(sb1.capacity());
	}

}
