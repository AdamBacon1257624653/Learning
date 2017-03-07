package com.ibm.springmvc.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

public class User {
	private String id;
	@NotEmpty(message = "UserName can not be empty")
	private String userName;
	@Range(min = 0, max = 200, message = "Invalid Age")
	private int age;
	@Email(message = "Incorrect Format")
	private String email;

	public User() {
		super();
	}
	
	public User(String id, String userName, int age, String email) {
		super();
		this.id = id;
		this.userName = userName;
		this.age = age;
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", age=" + age
				+ ", email=" + email + "]";
	}

}
