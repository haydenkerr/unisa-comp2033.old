
public class Main5_1 {

	
	//add not
	
	
	public Main5_1() {
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
	
	static int num = 0;
	public static int length(String str) {
		
		if (str == null ||  str.isEmpty()) {
			
			return 0;
			 
		} else {
			System.out.println(num); 
			num++;
			return 1 + length(str.substring(1));
			
		}
	}
	
public static int mystery(int n) {
		
		if (n == 0 ) {
			
			return 0;
			 
		} else {
			System.out.println(num+ ":-:" +n);
			
			num++;
			return n * n + mystery(n-1);
			
		}
	}

public static int factorial(int num) throws IllegalArgumentException {
	
	if (num <= 0 ) {
		
		return 1;
		 
	} else {
	
		return num * factorial(num-1);
		
	}
}
/**
 * 
 * @param x - raise this number to power
 * @param num - the exponent
 * @return x raised to the power num
 */
public static double example5_5_power(int x, int num) {
	if (num==0) {
		return 1;
	} else {
		return x * example5_5_power(x, num-1);
	}
}
/**
 * 
 * @param m - the larger number
 * @param n - the smaller number
 * @return Greatest common divisor of m and n
 */
public static double example5_6_gcd(int m, int n) {
	if (m % n ==0) {
		return n;
	} else {
		return example5_6_gcd(n, m %n);
	}
}

public static int f(int n) {   

	   if (n == 0) return 0;   

	   if (n == 1) return 1;   

	   if (n == 2) return 1;   

	return 2*f(n-2) + f(n-3); //2*(5-2) + (5-3)

	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		printChars("hello");
//		printReverseChars("hello");
		
//		System.out.println(length("hellohellohello"));
		
//		System.out.println(mystery(10));
		
//		System.out.println(factorial(-99));
//	
//		System.out.println(example5_5_power(5,5));
		
		System.out.println(example5_6_gcd(20,15));
		System.out.println(f(6));
	}

}
