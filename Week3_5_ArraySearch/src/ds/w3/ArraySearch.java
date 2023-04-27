package ds.w3;

import java.util.Arrays;

public class ArraySearch {
	
	/**
	 * Implement this method. 
	 * 
	 * @param needle 		This is the item you are searching for. 
	 * 
	 * @param haystack		This is the array of items that you are searching in. 
	 * 						The array will be sorted (smallest to biggest)
	 * 
	 * @return 				This method should return the index of the needle within the haystack. 
	 * 						If the item is not found in the haystack, your method should return -1.
	 */
	public static int searchForItemInArray(int needle, int[] haystack) throws Exception {
		
		Arrays.sort(haystack);
		int needleLoc = 0;
		for(int i =0; i< haystack.length; i++) {
			if (haystack[i]==needle) {
				needleLoc = i;
				return needleLoc;
			}
			else{
				needleLoc = -1;
			}
			}
		
		
		return needleLoc;
	}
	
}
