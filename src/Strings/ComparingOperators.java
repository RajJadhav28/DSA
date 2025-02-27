package Strings;

public class ComparingOperators {
	public static void main(String[] args) {
		String s="Virat";
		s.concat("Kohli");
		System.out.println(s);
		s=s.concat(" Kohli");
		System.out.println(s);//concacts both the String.
		String s1="Virat";//Stores in constant pool.
		String s2=new String("Virat");//Stores in heap Memory
		String s3="Virat";
		String s4="VIRAT";
		String s5="Ratan Tata";
		System.out.println(s1==s2);//false-because both the data are stored in
		//different storage 's1' is stored in constant pool & 's2' is stored in
		//heap memory.
		System.out.println(s1==s3);//true-because both are stored in constant pool
		System.out.println(s1==s4);//false-because String is case sensitive
		System.out.println(s1.equalsIgnoreCase(s4));
		System.out.println(s1.equals(s3));//true-because '.equals' does not see's
		//the location only data matters.
		System.out.println(s1.compareTo(s2));//0-because '.compareTo' 
		//does not see's the location only data matters.if both the values are
		//same it returns 0;
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s4));
		System.out.println(s1.compareTo(s5));
		
	}
}
