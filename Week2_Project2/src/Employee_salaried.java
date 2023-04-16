	// extend person to employee with interface
		public class Employee_salaried extends Employee implements EmployeeInterface {
			protected double annualSalary;
			
			
			
//			public Employee(String name, String ssn, int age, char gender, 
//					String address, String phoneNumber, 
//					String department, String jobTitle, int yearOfHire)

			// employee constructor
			public Employee_salaried(String name, String ssn, int age, char gender, 
					String address, String phoneNumber, 
					String department, String jobTitle, int yearOfHire, 
					double annualSalary) {
				//
				super(name, ssn, age, gender, address, phoneNumber,
						department, jobTitle,  yearOfHire );
				this.annualSalary = annualSalary;
			}

			// method to show employee info
			public void getEmployeeSalaryInfo() {
				System.out.println("Name: " + name);
				System.out.println("SSN: " + ssn+"\tAge: "+age);
				System.out.println("Gender: " + gender+"\tPhone: "+phoneNumber);
				System.out.println("Address: " + address);
				System.out.println("Employee Details");
				System.out.println("Annual Salary: $" + annualSalary);
							}
					
		@Override
			public void getPersonInfo() {
				// TODO Auto-generated method stub
				
			}
		 public static void main(String[] args) {
				
		        Employee_salaried staffMember2 = new Employee_salaried("John Kerr", "SSN##", 42, 'M', 
		        		"address st, city, postcode", "PhoneNumber###", 
		        		"Sales", "Sales Manager", 2017,
		        		65000);
		        staffMember2.getEmployeeSalaryInfo();
		    }	

		
		}
	


