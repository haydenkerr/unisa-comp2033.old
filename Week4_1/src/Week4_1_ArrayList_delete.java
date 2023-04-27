import java.util.*;;

/**
 * 
 * @author hayde
 * @see from text book, 68 Chapter 2 Lists and the Collections Framework
 * Write the following static method:
 * Deletes the first occurrence of target in aList.
 *	public static void delete(ArrayList<String> aList, String target)
 */

public class Week4_1_ArrayList_delete {

	public Week4_1_ArrayList_delete() {
		// TODO Auto-generated constructor stub
	}
	public static void delete(ArrayList<String> aList, String target) {
		
		int indexOld = aList.indexOf(target);
		
		aList.remove(indexOld);
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
		
		delete(stringList, "Bob1");
	}

}
