package ds.w3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.IntStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author simont
 *
 */
class ArraySearchTest {

	private int[] haystack;
	
	/**
	 * Populate the haystack before each test. 
	 */
	@BeforeEach
	void setUp() {
		int size = 15;
		
		this.haystack = IntStream
                .range(0, size)
                .toArray();
	
	}

	/**
	 * Test method for {@link ds.w3.ArraySearch#searchForItemInArray(int, int[])}.
	 */
	@Test
	void testSearchForItemInArray() throws Exception {
		// Find an item in the middle of the array. 
		assertEquals(ArraySearch.searchForItemInArray(3, this.haystack), 3);
		
		// Find an item at the end of the array
		assertEquals(ArraySearch.searchForItemInArray(14, this.haystack), 14);
		
		// Find an item at the start of the array
		assertEquals(ArraySearch.searchForItemInArray(0, this.haystack), 0);

		// Find an item that's not in the array. 
		assertEquals(ArraySearch.searchForItemInArray(16, this.haystack), -1);		
	}
}
