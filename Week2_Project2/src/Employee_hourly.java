	// extend person to employee with interface
		public class Employee_hourly extends Employee implements EmployeeInterface {
			protected double hourlyRate;
			protected double hoursWorked;
			protected double unionDues;
			
			
//			public Employee(String name, String ssn, int age, char gender, 
//					String address, String phoneNumber, 
//					String department, String jobTitle, int yearOfHire)

			// employee constructor
			public Employee_hourly(String name, String ssn, int age, char gender, 
					String address, String phoneNumber, 
					String department, String jobTitle, int yearOfHire, 
					double hourlyRate, double hoursWorked, double unionDues) {
				//
				super(name, ssn, age, gender, address, phoneNumber,
						department, jobTitle,  yearOfHire );
				this.hourlyRate = hourlyRate;
				this.hoursWorked = hoursWorked;
				this.unionDues = unionDues;
			}

			// method to show employee info
			public void getEmployeeHourlyInfo() {
				System.out.println("Name: " + name);
				System.out.println("SSN: " + ssn+"\tAge: "+age);
				System.out.println("Gender: " + gender+"\tPhone: "+phoneNumber);
				System.out.println("Address: " + address);
				System.out.println("Employee Details");
				System.out.println("Per hour $: " + hourlyRate+"\tHours Worked: "+ hoursWorked);
				System.out.println("Uniion Dues $: " + unionDues);
			}
					
		@Override
			public void getPersonInfo() {
				// TODO Auto-generated method stub
				
			}
		 public static void main(String[] args) {
				
		        Employee_hourly staffMember1 = new Employee_hourly("John Kerr", "SSN##", 42, 'M', 
		        		"address st, city, postcode", "PhoneNumber###", 
		        		"Sales", "Sales Manager", 2017,
		        		50, 38,26.22);
		        staffMember1.getEmployeeHourlyInfo();
		    }	

		
		}
	


