package ECommerceSystem.dataAccess.concretes;


import java.util.ArrayList;
import java.util.List;

import ECommerceSystem.dataAccess.abstracts.UserDao;
import ECommerceSystem.entities.concretes.User;

public  class DatabaseUserDao implements UserDao{
	
	List<User> users = new ArrayList<User>();
	
	
	@Override
	public void register(User user) {
		users.add(user);
		System.out.println("Kaydýnýz baþarýyla alýnmýþtýr");
	}

	
	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return users;
	}

	
	

}
