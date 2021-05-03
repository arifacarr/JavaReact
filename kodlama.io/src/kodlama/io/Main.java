package kodlama.io;

public class Main {

	public static void main(String[] args) {
		
		UserManager userManagers = (UserManager) new UserManager();
		
		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();
		
		Student student1 = new Student("Arif" , "Acar" , 20 , "arif@gmail.com" , 119 , "HÜ");
		
		studentManager.add(student1);	// Ortak Classtan gelen metot.
		studentManager.joinACourse(student1); 	//Student classýna özgü class. 
		studentManager.showName(student1); 		// Override metot.
		
		Instructor instructor1 = new Instructor("Engin" , "Demiroð" , 28 , "demirog@gmail.com" , 384 , "ODTÜ");
		
		instructor1.firstName = "Engin ";
		instructor1.lastName = "Demiroð";
		
		instructorManager.add(instructor1);		
		instructorManager.addCourses(instructor1);		
		instructorManager.showName(instructor1); 	
		
	}

}
