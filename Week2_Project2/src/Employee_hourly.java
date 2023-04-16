	// extend person to employee with interface
		public class Employee_hourly extends Person implements PersonInterface {
			protected double hourlyRate;
			protected double hoursWorked;
			protected double unionDues;
			

			// employee constructor
			public Employee_hourly(String name, String ssn, int age, char gender, 
					String address, String phoneNumber, double hourlyRate, double hoursWorked, double unionDues) {
				//
				super(name, ssn, age, gender,address, phoneNumber);
				this.hourlyRate = hourlyRate;
				this.hoursWorked = hoursWorked;
				this.unionDues = unionDues;
			}

			// method to show employee info
			public void getEmployeeInfo() {
				System.out.println("Name: " + name);
				System.out.println("SSN: " + ssn+"\tAge: "+age);
				System.out.println("Gender: " + gender+"\tPhone: "+phoneNumber);
				System.out.println("Address: " + address);
				System.out.println("Student Details");
				System.out.println("GPA: " + gpa+"\tMajor: ");
				System.out.println("Year of Graduation: " + yearOfGraduation);
			}
					
		@Override
			public void getPersonInfo() {
				// TODO Auto-generated method stub
				
			}
		 public static void main(String[] args) {
				
		        Employee_hourly student1 = new Employee_hourly("John Kerr", "SSN##", 42, 'M', 
		        		"address st, city, postcode", "PhoneNumber###", 
		        		6.0, "Major degree info",2025);
		        student1.getEmployeeInfo();
		    }	

		
		}
	


