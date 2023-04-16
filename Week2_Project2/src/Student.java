	// extend person to employee with interface
		public class Student extends Person implements PersonInterface {
			protected double gpa;
			protected String major;
			protected int yearOfGraduation;
	

			// employee constructor
			public Student(String name, String ssn, int age, char gender, 
					String address, String phoneNumber, double gpa, String major, int yearOfGraduation) {
				//
				super(name, ssn, age, gender,address, phoneNumber);
				this.gpa = gpa;
				this.major = major;
				this.yearOfGraduation = yearOfGraduation;
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
				
		        Student student1 = new Student("John Kerr", "SSN##", 42, 'M', 
		        		"address st, city, postcode", "PhoneNumber###", 
		        		6.0, "Major degree info",2025);
		        student1.getEmployeeInfo();
		    }	

		
		}
	


