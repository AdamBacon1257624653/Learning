package com.ibm.springmvc.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

public class User {
	private String id;
	private String userName;
	private int age;
	@Email
	@NotNull
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

	@NotEmpty(message="Empty Name")
//	@NotBlank(message="Blank Name")
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Range(min=1,max=150,message="Invalid Age")
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Email(message="Please type well-formed email address")
//	@NotBlank(message="Blank Email")
	@NotNull(message="Null Email")
	@NotEmpty(message="Empty Email")
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
