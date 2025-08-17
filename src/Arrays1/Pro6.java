package Arrays1;

public class Pro6 {
	public static void main(String[] args) {
		String fruits[] = {"Apple", "Banana", "Tomato", "Tiger", "Orange", "Table"};
		System.out.println("String that starts with T:");
		for(String s:fruits) {
			if(s.length()>0 && s.charAt(0)=='T') {
				System.out.println(s);
			}
		}

	}
}
