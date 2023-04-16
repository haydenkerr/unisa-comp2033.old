	// extend person to employee with interface

		public abstract class Employee extends Person implements PersonInterface {
			protected String department;
			protected String jobTitle;
			protected int yearOfHire;
			
			
			// employee constructor
			public Employee(String name, String ssn, int age, char gender, 
					String address, String phoneNumber, String department, String jobTitle, int yearOfHire) {
				//
				super(name, ssn, age, gender,address, phoneNumber);
				this.department = department;
				this.jobTitle = jobTitle;
				this.yearOfHire = yearOfHire;
			}

			
					
		@Override
			public void getPersonInfo() {
				// TODO Auto-generated method stub
				
			}
		}
	
	


