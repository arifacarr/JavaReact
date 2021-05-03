package kodlama.io;

public class Student extends User{
	
	public Student(String firstName, String lastName, int age, String mail) {
		super(firstName, lastName, age, mail);
		// TODO Auto-generated constructor stub
	}

	int id;
	String school;
	
	public Student(String firstName, String lastName, int age, String mail, int id, String school) {
		super(firstName, lastName, age, mail);
		this.id = id;
		this.school = school;
	}
}
