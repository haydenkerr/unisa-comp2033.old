
import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.IntStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonTest {



	Person person1 = new Person("jim", "bob", "jones123");
	Person person2 = new Person("jim", "bob", "jones123");
	Person person3 = new Person("jim", "bob", "123Jones");
	Person person4 = new Person("felix", "huxley", "different");
	
	/**
	 * 
	 */
	@BeforeEach
	void setUp() {
	
	
	}

	/**
	 * 
	 */
	@Test
	void testCheckForEquals() throws Exception {
		System.out.println(person1.toString());
		System.out.println(person2.toString());
		System.out.println(person1.equals(person2));
		System.out.println(person3.toString());
		System.out.println(person1.equals(person3));
		System.out.println(person4.toString());
		System.out.println(person1.equals(person4));
		// Find Equals Success - exact
		
		assertTrue(person1.equals(person2));
		
		// Find Equals - firstName lastName only
		assertTrue(person1.equals(person3));
		
		// no match
		assertFalse(person1.equals(person4));
	}
}
