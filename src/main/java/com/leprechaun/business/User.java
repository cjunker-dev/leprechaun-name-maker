package com.leprechaun.business;

import javax.persistence.*;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String firstName;
	private String lastName;
	private String birthMonth;
	private String leprechaunName;
	public User() {
		super();
	}
	public User(int id, String firstName, String lastName, String birthMonth, String leprechaunName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthMonth = birthMonth;
		this.leprechaunName = leprechaunName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getBirthMonth() {
		return birthMonth;
	}
	public void setBirthMonth(String birthMonth) {
		this.birthMonth = birthMonth;
	}
	public String getLeprechaunName() {
		return leprechaunName;
	}
	public void setLeprechaunName(String leprechaunName) {
		this.leprechaunName = leprechaunName;
	}
	
	
}
