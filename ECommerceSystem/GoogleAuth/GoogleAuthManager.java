package ECommerceSystem.GoogleAuth;

import ECommerceSystem.entities.concretes.User;

public class GoogleAuthManager {
	
	public void googleSign(User user) {
		System.out.println("Google ile kay�t yap�ld�"+" "+user.getFirstName()+" "+user.getLastName());
	}
}
