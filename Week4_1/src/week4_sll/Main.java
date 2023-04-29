package week4_sll;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Node second = new Node(2, null);
		Node first = new Node(1, second);

		SingleLinkedList sll = new SingleLinkedList(first);
		sll.add(3);
		
		System.out.println(sll.toString());
	}

}
