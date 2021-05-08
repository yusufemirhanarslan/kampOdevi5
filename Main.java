
import ECommerceSystem.business.abstracts.UserService;
import ECommerceSystem.business.concretes.UserManager;
import ECommerceSystem.core.concretes.EMailLogged;
import ECommerceSystem.core.concretes.GoogleManagerAdapter;
import ECommerceSystem.dataAccess.concretes.DatabaseUserDao;
import ECommerceSystem.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		DatabaseUserDao databaseUserDao = new DatabaseUserDao();
		
		UserService service = new UserManager(new DatabaseUserDao(),new EMailLogged());
		
		User user1= new User("Yusuf Emirhan","Arslan","example1@gmail.com", "132456");
		
		User user2 = new User("aaa", "bbb", "example2@gmail.com", "147856");
		
		User user3 = new  User("cccc", "dddd","example3@gmail.com", "466213");
		
		User user4 = new User("eeee","ffff", "example4@gmail.com", "564789");
		
		service.signUp(user1);
		System.out.println();
		service.signUp(user2);
		System.out.println();
		
		service = new UserManager(new DatabaseUserDao(),new GoogleManagerAdapter());
		service.signUp(user3);
		System.out.println();
		service.signUp(user4);
		System.out.println();
		
		service.signIn("example3@gmail.com","466213");
		System.out.println();
		service.signIn("example4@gmail.com","564789");
		System.out.println();
		
		service = new UserManager(new DatabaseUserDao(),new EMailLogged());
		
		User user5 = new User("ahmet", "aða", "example5@gmail.com","798745");
		service.signUp(user5);
		System.out.println();
		User user6 = new User("ali", "aðaç", "example5@gmail.com","45648461");
		service.signUp(user6);
		System.out.println();
		
		service.signIn("example5@gmail.com","789745");
		System.out.println();
		service.signIn("example5@gmail.com","789746");
		
	}

}
