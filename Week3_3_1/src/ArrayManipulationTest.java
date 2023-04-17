import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArrayManipulationTest {

	ArrayManipulation am;
	@BeforeEach
	void setUp() throws Exception {
		am = new ArrayManipulation();
	}

	@Test
	void testResize() {
		int[] input = new int[5];
		input[2] = 5;
		input[4] = -1;
		
		int[] resized = am.resize(input);
		assertEquals(10, resized.length, "Resized array does not have the correct length");
		
		assertEquals(5, resized[2], "Resized array does not have the same elements");
		assertEquals(-1, resized[4], "Resized array does not have the same elements");
	}

	@Test
	void testFillArray() {
		int[] input = new int[15];
		
		am.fillArray(input);
		
		for(Integer i : input ) {
			assertNotNull(i, "Filled array has empty elements");
		}
	}

}
