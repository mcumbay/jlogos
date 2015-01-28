package com.dfwcomputech.jlogos.common.model;

public class User {
	private String user;
	private String password;
	private String name;

	public User(String user, String password, String name) {
		this.user = user;
		this.password = password;
		this.name = name;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
