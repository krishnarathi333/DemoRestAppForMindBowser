package com.rest.demoRest;

public class managesrBean {
	public String firstName;
	public String lastName;
	public String password;
	public String address;
	public String company;
	
	public managesrBean(String firstName, String lastName, String password, String address, String company) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.address = address;
		this.company = company;
	}
	public managesrBean() {
		// TODO Auto-generated constructor stub
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	

}
