
public class ArrayManipulation {
	/**
	 * An empty constructor. This class doesn't have any instance variables. 
	 */
	public ArrayManipulation() {
		
	}
	
	/**
	 * Return an array that has double the capacity of the method parameter
	 * @param array The array to resize
	 * @return		The resized array. The new array should have double the capacity, and maintain any items in the original. 
	 */
	public int[] resize(int[] array) {
		
		int[] newArray = new int[array.length*2];
		int i;
		for (i=0; i<array.length; i++)
		{
			newArray[i]=array[i];
		}
		
		
//		for(index = 0; index< array.length; index++)
//		{
//			array[index] = array[index]*2;
//		}
		return newArray;
	}
	
	/**
	 * Print the array contents. 
	 * 
	 * No tests are provided for this method. It should print the array to your console. 
	 * 
	 * @param array The array to print 
	 */
	public void printArray(int[] array) {
		
	}
	
	/**
	 * Fill the given array with integers. 
	 * @param array The array to fill. 
	 * @return		The filled array. 
	 */
	public int[] fillArray(int[] array) {
		return null;
	}
}
