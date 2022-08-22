class User {
	
	private String userName;
	private String password;

	public User(String userName, String password){
		this.userName = userName;
		this.password = password;
	}

	public void login(String userName, String password){
		if(this.userName.equals(userName) && this.password.equals(password)){
			System.out.println("Access Granted!");
		}
		else
			System.out.println("Access Denied!");
	}
}


public class Main {
	public static void main(String[] args){
		User dbit = new User("dbit", "dbit");
		dbit.login("dbit", "dbit");
		dbit.login("dbit", "1234");
		return;
	}
}
