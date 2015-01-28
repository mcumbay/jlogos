package com.dfwcomputech.jlogos.service.mock;

import org.springframework.stereotype.Service;

import com.dfwcomputech.jlogos.common.model.User;
import com.dfwcomputech.jlogos.service.SecurityService;

@Service
public class MockSecurityService implements SecurityService{

	private static final long serialVersionUID = 1L;
	private User principal;
	private static final String MOCKUSER="admin";
	private static final String MOCKPASS="admin";
	@Override
	public boolean isUserSignedIn() {
		// TODO Auto-generated method stub
		return principal!=null;
	}

	@Override
	public User getPrincipal() {
		return principal;
	}

	@Override
	public User login(String user,String password) {
		if (MOCKUSER.equalsIgnoreCase(user) && MOCKPASS.equalsIgnoreCase(password))
			principal= new User(MOCKUSER,MOCKPASS,"Miguel");
		return principal;
	}

}
