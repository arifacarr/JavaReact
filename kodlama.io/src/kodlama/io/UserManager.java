package kodlama.io;

public class UserManager {
	
	public void add(User user) {
		System.out.println("Kullan�c� eklendi: " + user.firstName);
	}
	
	public String showName(User user) {
		return user.firstName + user.lastName;
	}
}
