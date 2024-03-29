package com.struts.action;

public class LoginAction {
	public String username;
	public String city;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String execute() {
		if(username.equals("Farhan"))
			return "success";
		else
			return "error";
		
	}
}