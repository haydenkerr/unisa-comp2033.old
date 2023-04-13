/**
 * 
 */

/**
 * @author hayde
 *
 */
/**
 * 
 */

/**
 * @author hayde
 *
 */
	/**
	 * @param args
	 */

// abstract class created for person

public abstract class Person {
		protected String name;
		protected String ssn;
		protected int age;
		protected char gender;
		protected String address;
		protected String phoneNumber;

		public Person(String name, String ssn, int age, char gender, String address, String phoneNumber) {
			this.name = name;
			this.ssn = ssn;
			this.age = age;
			this.gender = gender;
			this.address = address;
			this.phoneNumber = phoneNumber;

		}
		// abstract methods
		public abstract void getPersonInfo();
	}











