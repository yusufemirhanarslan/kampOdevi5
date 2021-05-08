package ECommerceSystem.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


import ECommerceSystem.business.abstracts.UserServiceCheck;
import ECommerceSystem.entities.concretes.User;

public class UserCheckServiceManager implements UserServiceCheck{
	

	@Override
	public boolean validator(User user) {
			
		if(passwordValidator(user)&&firstNameValidator(user)&&lastNameValidator(user)&&eMailValidator(user)) {
			return true;
		}else if(!passwordValidator(user)){
			System.out.println("Þifreniz en az 6 karakterden oluþmalýdýr");
		}else if(!firstNameValidator(user)) {
			System.out.println("Ýsminiz en az 2 karakterden oluþmalýdýr");
		}else if(lastNameValidator(user)) {
			System.out.println("Soyisminiz en az 2 karakterden oluþmalýdýr");
		}else if(!eMailValidator(user)) {
			System.out.println("Lütfen geçerli bir e-mail giriniz");
		}
		return false;
		
		
		
	}

	public  boolean passwordValidator(User user) {
			
		int passwordLength = user.getPassword().length();
		if(passwordLength<6){
			return false;
		}
		return true;
	}

	@Override
	public boolean eMailValidator(User user) {
		final String eMailPattern = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
		Pattern pattern = Pattern.compile(eMailPattern,Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(user.getMail());
		
		return matcher.matches();
		
	}

	@Override
	public  boolean firstNameValidator(User user) {
		int firstNameLength = user.getFirstName().length();
		
		if(firstNameLength<2) {
			return false;
		}return true;
		
	}
	
	@Override
	public boolean lastNameValidator(User user) {
		int lastNameLength = user.getLastName().length();
		
		if(lastNameLength<2) {
			return false;
		}return true;
	}

	
	

}
