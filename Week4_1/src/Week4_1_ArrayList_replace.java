import java.util.*;;

/**
 * 
 * @author hayde
 * @see from text book, 68 Chapter 2 Lists and the Collections Framework
 */
public class Week4_1_ArrayList_replace {

	public Week4_1_ArrayList_replace() {
		// TODO Auto-generated constructor stub
	}
	public static void replace(ArrayList<String> aList, String oldItem,
			 String newItem) {
		
		int indexOld = aList.indexOf(oldItem);
		
		aList.set(indexOld, newItem);
		System.out.println(aList.toString());

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> stringList = new ArrayList<>();
		
		stringList.add("Bob");
		stringList.add("Bob1");
		stringList.add("Bob2");
		stringList.add("jim_Bob");
		
		System.out.println(stringList.toString());
		
		for (int i =0; i < stringList.size(); i++) {
			if(stringList.get(i)!=null) {
			System.out.println(stringList.get(i).toString());
		}
		}
		
		replace(stringList, "Bob1", "Jemima");
	}

}
