import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Collections;
	import java.util.Comparator;
	import java.util.List;
	import java.util.Random;
	import java.util.stream.IntStream;
	
public class Main5_2 {
// test
	
	// more notes
	
	
	
	// TODO Auto-generated constructor stub
	public static void main(String[] args){
		// TODO Auto-generated method stub

		/** Setup: Create a list, and fill it with 10 random numbers between and 19.
		*/ 
		List<Integer> l = new ArrayList<>();
		
//		
//		IntStream intStream = new Random().ints(10, 0, 19);
//		l.addAll( intStream.boxed().toList());
		System.out.println(l) ;
		// Sort the list using the List sort
		l.sort(new Comparator<Integer>() {
		@Override
		public int compare(Integer lhs, Integer rhs) {
			if ( lhs == rhs ) {
					return 0;}
			if ( rhs < lhs ) {
				return -1;
			}
		return 1;
		} 
		});
		System.out.println(l);
		
	}
}
		

		
		
		