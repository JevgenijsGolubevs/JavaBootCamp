package sef.module6.sample;

public class VirtualMethodSample {
	public static void main(String arg[]){
		Person_P p = new Person_P();
		p.setName("John Doe");
		
		//Student inherits the methods and behavior from the Person class
		Student_P s = new Student_P();
		s.setName("Jane Doe");
	
		s.setSchool("A Fictional School");
		s.setGrade(10);

		Employee_P employee_p = new Employee_P();
		employee_p.setName("Don Gan");
		employee_p.setAge(25);


		rollCall(s);
		rollCall(p);
		rollCall(employee_p);
	
	}

	public static void rollCall(Person_P temp){
			temp.announce();
	}

}
