package week4_sll;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SLLTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testAddToEmptyList() {
		SingleLinkedList sll = new SingleLinkedList();
		sll.add(1);

		assertEquals(sll.size(), 1, "Insertion into empty list doesn't work (size test failed)");

		assertEquals(sll.head.data, 1, "Incorrect data found in the list.");
	}

	@Test
	void testAddToEndOfList() {
		Node second = new Node(2, null);
		Node first = new Node(1, second);

		SingleLinkedList sll = new SingleLinkedList(first);
		sll.add(3);

		assertEquals(sll.size(), 3, "Insertion into non-empty list doesn't work (size test failed)");
		assertEquals(second.next, new Node(3, null));
	}

	@Test
	void testAddToStartOfList() {
		Node second = new Node(3, null);
		Node first = new Node(2, second);

		SingleLinkedList sll = new SingleLinkedList(first);
		sll.add(1, 1);

		assertEquals(sll.size(), 3, "Insertion into non-empty list doesn't work (size test failed)");
		assertEquals(sll.head, new Node(1, first));
	}

	@Test
	void testRemove() {
		SingleLinkedList sll = new SingleLinkedList(new Node(1));

		// Call the 'remove(item)' method, not the 'remove(index)' method.
		sll.remove(Integer.valueOf(1));
	}
}
