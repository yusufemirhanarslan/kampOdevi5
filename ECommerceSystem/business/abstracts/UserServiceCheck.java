package ECommerceSystem.business.abstracts;

import ECommerceSystem.entities.concretes.User;

public interface UserServiceCheck {
		
		boolean validator(User user);
		boolean passwordValidator(User user);
		boolean eMailValidator(User user);
		boolean firstNameValidator(User user);
		boolean lastNameValidator(User user);
}
