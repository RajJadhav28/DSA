package Arrays;

public class StartsWithT {
	public static void main(String[] args) {
		String[] strings = {"Apple", "Banana", "Tomato", "Tiger", "Orange", "Table"};
		System.out.println("String that starts with T:");
		for(String str:strings) {
			if(str.length()>0 && str.charAt(0)=='T') {
				System.out.println(str);
			}
		}
	}
}
