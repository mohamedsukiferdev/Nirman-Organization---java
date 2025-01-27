package school;

public class Student {
	private String name;
	private int id;
	private long phoneNume;
	private String email;

	Student(){
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getPhoneNume() {
		return phoneNume;
	}

	public void setPhoneNume(long phoneNume) {
		this.phoneNume = phoneNume;
	}

	public Student(String name, int id, long phoneNume, String email) {
		super();
		this.name = name;
		this.id = id;
		this.phoneNume = phoneNume;
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", phoneNume=" + phoneNume + ", email=" + email + "]";
	}
}
