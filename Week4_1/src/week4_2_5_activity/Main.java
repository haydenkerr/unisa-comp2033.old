package week4_2_5_activity;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void printChars(String str) {
		if(str == null || str.isEmpty()) {
			return;
		}else {
			System.out.println(str.charAt(0));
			printChars(str.substring(1));
		}
		
	}
	
	public static void printReverseChars(String str) {
		if(str == null || str.isEmpty()) {
			return;
		}else {
			
			printChars(str.substring(1));
			System.out.println(str.charAt(0));
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayReverser<String> ar = new ArrayReverser<>();
		String[] input = {"a", "b", "c", "d", "e"};
		String[] expected = {"e", "d", "c", "b", "a"};
		
		System.out.println(input.toString());
		System.out.println(expected.toString());
		
		printChars("hello");
		printReverseChars("hello");
		
	}

}
