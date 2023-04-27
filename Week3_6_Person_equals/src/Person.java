import java.util.Objects;

/**
 * 
 */

/**
 * @author hayde
 *
 */
public class Person {

	/**
	 * 
	 */
	String firstName;
	String lastName;
	String idNumber;
	
	
	
	/**
	 * @param firstName
	 * @param lastName
	 * @param idNumber
	 */
	public Person(String firstName, String lastName, String idNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName);
	}

	@Override
	public boolean equals(Object q) {
		if (this == q) {
			return true;
		}
		if (!(q instanceof Person)) {
			return false;
		}
		Person other = (Person) q;
		return Objects.equals(firstName, other.firstName) 
				&& Objects.equals(lastName, other.lastName);
	}
	

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", "
				+ "lastName=" + lastName 
				+ ", idNumber=" + idNumber + "]";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
