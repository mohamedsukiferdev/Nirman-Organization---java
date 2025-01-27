package school;

public class Teacher {
	private int id;
	private String name;
	private long phoneNumber;
	private double  salary;
	
	Teacher(){}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", phoneNumber=" + phoneNumber + ", salary=" + salary + "]";
	}

	public Teacher(int id, String name, long phoneNumber, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
