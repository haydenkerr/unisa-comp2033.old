package week4_sll;

public class SingleLinkedList {

	public Node head;

	public SingleLinkedList() {
		this.head = null;
	}
	
	public SingleLinkedList(Node head) {
		this.head = head;
	}

	/**
	 * An add method. This should append the specified item to the end of the list.
	 *
	 * @param item The item to insert
	 * @return
	 */
	public boolean add(Integer item) {
		return true;
	}

	/**
	 * An add method. This should insert the specified item at the specified index in the list.
	 *
	 * @param item 		The item to insert
	 * @param index 	The index to insert at
	 */
	public void add(Integer item, int index) {
			
	}


	/**
	 * Remove the item at the given index.
	 *
	 * @param index 	The index to remove from. 
	 * @return 			The item that was removed. 
	 */
	public Integer remove(int index) {
		return null;
	}



	/**
	 * Remove the specified item from the list, if it exists.
	 * Be careful when trying to call this! It has a very similar method signature to
	 * the 'remove(index)' method. To pass in an Integer, you can either create a new one:
	 *     list.remove(new Integer(1));
	 * or use the Integer.valueOf() method:
	 *     list.remove(Integer.valueOf(1));
	 *
	 * @param item		The item to remove. 
	 * @return			True if the item was removed, false otherwise. 
	 */
	public boolean remove(Integer item) {
		return false;
	}


	public Integer get(int index) {
		Node ref = head;
		for ( int i = 0 ; i < index && ref != null ; ++i ) {
			ref = ref.next;
		}

		return ref.data;
	}


	public int size() {
		Node ref = this.head;
		int count = 0;

		while ( ref != null ) {
			count++;
			ref = ref.next;
		}

		return count;
	}

	public boolean isEmpty() {
		return this.head == null;
	}
}
