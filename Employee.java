package day8;

public class Employee {
	String name;
	int id;
	long phoneNumber;
	String Email;
	float salary;
	
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();
		Employee emp4 = new Employee();
		Employee emp5 = new Employee();
		
		emp1.name = "Vijay";
		emp1.id = 21091;
		emp1.phoneNumber = 9012345674l;
		emp1.Email = "vijay@gmail.com";
		emp1.salary = 40000f;
		
		emp2.name = "Ajith";
		emp2.id = 21092;
		emp2.phoneNumber = 9012345674l;
		emp2.Email = "ajith@gmail.com";
		emp2.salary = 50000f;
		
		emp3.name = "Suriya";
		emp3.id = 21093;
		emp3.phoneNumber = 9012345674l;
		emp3.Email = "suriya@gmail.com";
		emp3.salary = 60000f;
		
		emp4.name = "Vikram";
		emp4.id = 21094;
		emp4.phoneNumber = 9012345674l;
		emp4.Email = "vikram@gmail.com";
		emp4.salary = 70000f;
		
		emp5.name = "Dhanush";
		emp5.id = 21095;
		emp5.phoneNumber = 9012345674l;
		emp5.Email = "dhanush@gmail.com";
		emp5.salary = 80000f;
		System.out.println("Employee Name :"+emp1.name);
		System.out.println("Employee Id :"+emp1.id );
		System.out.println("Employee Phone Number :"+emp1.phoneNumber);
		System.out.println("Employee Email :"+emp1.Email );
		System.out.println("Employee salary :"+emp1.salary );
	}


}
