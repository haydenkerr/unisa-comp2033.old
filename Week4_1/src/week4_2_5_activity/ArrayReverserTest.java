package week4_2_5_activity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArrayReverserTest {

	@Test
	void testReverseArrayUsingStrings() {
		ArrayReverser<String> ar = new ArrayReverser<>();
		String[] input = {"a", "b", "c", "d", "e"};
		String[] expected = {"e", "d", "c", "b", "a"};
		
		assertArrayEquals(expected, ar.reverseArray(input));
	}

}
