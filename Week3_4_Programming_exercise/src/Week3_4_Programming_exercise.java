import java.util.Arrays;

/*
 * You’ve learned about arrays and have practiced using them. This exercise will further develop 
 * your understanding by challenging you to compare two arrays, and the items inside them. 
 * You'll need to  * implement an equals() method and write some code to compare two arrays 
 * based on their contents. 
 * Comparing objects is an important action in our code, and it’s crucial to many of the algorithms 
 * you’ll be using in the projects and coding activities through the remainder of this course.  
 * 
 * 
 * 
 * 
 */


public class Week3_4_Programming_exercise {

	public Week3_4_Programming_exercise() {
		// TODO Auto-generated constructor stub
	}

	public static boolean sameElements(int[] a, int[] b) {
		if ( a.length!= b.length) 
		{
	      return false;
	      
		}	      // Sort the arrays
	        Arrays.sort(a);
	        
	        Arrays.sort(b);
	      
	        for (int i = 0; i < a.length; i++) {
	      if (a[i] != b[i]) {
	      return false;
	            }
	      else if  (a[i] == b[i]) {
	      return true;
	            }
	        }
	      return true;
		}
	



	
	public static void main(String[] args) {
		int [] intA = {121,144,19,161,19,144,19,11};
//		int [] intB = {121,144,19,161,19,144,19,11};
		int [] intB = {11,121,144,19,161,19,144,19};
		
		System.out.println(sameElements(intA, intB));
		
		
	}
}
