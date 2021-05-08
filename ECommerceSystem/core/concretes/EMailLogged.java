package ECommerceSystem.core.concretes;

import ECommerceSystem.core.abstracts.LoggerService;
import ECommerceSystem.entities.concretes.User;

public class EMailLogged implements LoggerService{

	@Override
	public void log(User user) {
		System.out.println("Email loggerý çaðrýldý");
		
	}

}
