package ECommerceSystem.core.concretes;

import ECommerceSystem.GoogleAuth.GoogleAuthManager;
import ECommerceSystem.core.abstracts.LoggerService;
import ECommerceSystem.entities.concretes.User;

public class GoogleManagerAdapter implements LoggerService{

	@Override
	public void log(User user) {
		
		GoogleAuthManager authManager = new GoogleAuthManager();
		authManager.googleSign(user);
	}

}
