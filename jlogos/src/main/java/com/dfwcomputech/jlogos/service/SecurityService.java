package com.dfwcomputech.jlogos.service;

import java.io.Serializable;

import com.dfwcomputech.jlogos.common.model.User;

public interface SecurityService extends Serializable{
	public boolean isUserSignedIn();
	public User getPrincipal();
	public User login(String user,String password);
}
