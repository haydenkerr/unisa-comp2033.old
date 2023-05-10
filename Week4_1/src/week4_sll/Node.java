package week4_sll;

import java.util.Objects;

public class Node<E> {
	public Node next;
	public Integer data;

	public Node(Integer data) {
		this.data = data;
		this.next = null;
	}

	public Node(Integer data, Node next) {
		this.data = data;
		this.next = next;
	}



	@Override
	public String toString() {
		return "Node [next=" + next + ", data=" + data + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(data, next);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if ((obj == null) || (getClass() != obj.getClass())) {
			return false;
		}
		Node other = (Node) obj;
		return Objects.equals(data, other.data) && Objects.equals(next, other.next);
	}


}
