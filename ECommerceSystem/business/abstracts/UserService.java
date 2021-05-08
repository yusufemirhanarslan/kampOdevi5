package ECommerceSystem.business.abstracts;

import ECommerceSystem.entities.concretes.User;

public interface UserService {
	
	void verificationMessage(User user);
	boolean verificationLink();
	boolean signUp(User user);
	boolean signIn(String mail,String password);
}
