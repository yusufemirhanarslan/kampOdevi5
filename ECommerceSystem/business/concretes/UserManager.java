package ECommerceSystem.business.concretes;

import ECommerceSystem.business.abstracts.UserService;
import ECommerceSystem.business.abstracts.UserServiceCheck;
import ECommerceSystem.core.abstracts.LoggerService;
import ECommerceSystem.dataAccess.abstracts.UserDao;
import ECommerceSystem.entities.concretes.User;

public class UserManager implements UserService {
	
	private UserDao userDao;
	private UserServiceCheck check = new UserCheckServiceManager();
	private LoggerService loggerService;	
	public UserManager(UserDao userDao,LoggerService loggerService) {
		super();
		this.userDao = userDao;
		this.loggerService =loggerService;
	}

	@Override
	public void verificationMessage(User user) {
		System.out.println(user.getMail()+" "+"mailinize doðrulama maili gönderildi lütfen kontrol ediniz.");
		
	}


	@Override
	public boolean verificationLink() {
		return true;
	}

	@Override
	public boolean signUp(User user) {
		
		if(this.check.validator(user) && !this.eMailCheck(user.getMail())) {
			this.verificationMessage(user);
			if(this.verificationLink()) {
				this.userDao.register(user);
			}else {
				System.out.println("Lütfen doðrulama linkine týklayýp üyeliðinizi tamamlayýn");
			}
			
		}
		this.loggerService.log(user);
		return true;
	}


	@Override
	public boolean signIn(String mail, String password) {
			
		for(User users:userDao.getAll()) {
			if(mail.equals(users.getMail()) && password.equals(users.getPassword())) {
				System.out.println("Sisteme giriþ baþarýlý"+" "+users.getFirstName()+" "+users.getLastName());
				return true;
			}
		}
		System.out.println("Lütfen mail veya þifrenizi kontrol ediniz");
		return false;
	}

	public boolean eMailCheck(String mail) {
		for(User user:userDao.getAll()) {
			if(mail.equals(user.getMail())) {
				System.out.println("Mail sisteme kayýtlý");
				return true;
			}
		}
		return false;
	}

	

}
