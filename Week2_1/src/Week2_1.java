/**
 * 
 */

/**
 * @author hayde
 *
 */
public class Week2_1 {

	/**
	 * @param args
	 */

// abstract ckass created for person
	
	public abstract class Person {
		protected String firstName;
		protected String lastName;
		protected int dayOfBirth;
		protected int monthOfBirth;
		protected int yearOfBirth;

		public Person(String firstName, String lastName, int dayOfBirth, int monthOfBirth, int yearOfBirth) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.dayOfBirth = dayOfBirth;
			this.monthOfBirth = monthOfBirth;
			this.yearOfBirth = yearOfBirth;


		}
		public abstract void getPersonInfo();
	}

	// create interface
	public interface EmployeeInterface {
		public void getEmployeeInfo();

	}

// extend person to employee wiht interface
	public class Employee extends Person implements EmployeeInterface {
		protected String taxFileNumber;
		protected String superNumber;
		protected String employeeID;
		protected String position;


		// employee constructer
		public Employee(String firstName, String lastName, int dayOfBirth, int monthOfBirth, 
				int yearOfBirth, String taxFileNumber, String superNumber, String employeeID, String position) {
			//
			super(firstName, lastName, dayOfBirth, monthOfBirth, yearOfBirth);
			this.taxFileNumber = taxFileNumber;
			this.superNumber = superNumber;
			this.employeeID = employeeID;
			this.position = position;
		}
		
		// method to show employee info
		public void getEmployeeInfo() {
			System.out.println("Name: " + firstName +" "+lastName);
			System.out.println("BirthDate: " + dayOfBirth+"-"+monthOfBirth+"-"+yearOfBirth);
			System.out.println("EmployeeID: " + dayOfBirth+"-"+monthOfBirth+"-"+yearOfBirth);
			
		}


		


		@Override
		public void getPersonInfo() {
			// TODO Auto-generated method stub
			
		}



	}



	public void employeeAbstract() {
	}





}





