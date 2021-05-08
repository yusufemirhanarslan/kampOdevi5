package ECommerceSystem.dataAccess.abstracts;


import java.util.List;

import ECommerceSystem.entities.concretes.User;

public interface UserDao {
	
	void register(User user);
	List<User> getAll();
 }
