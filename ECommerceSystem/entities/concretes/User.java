package ECommerceSystem.entities.concretes;

import ECommerceSystem.entities.abstracts.Entity;

public class User implements Entity{
	
	String firstName;
	String lastName;
	String mail;
	String password;
	
	public User() {}

	public User(String firstName, String lastName, String mail, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mail = mail;
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
}
