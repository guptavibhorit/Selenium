package com.variant.springboot.web.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

	public boolean validateUser(String userid, String password) {
		// variant, dummy
		
		
		return (userid.equalsIgnoreCase("variant")
				&& password.equalsIgnoreCase("dummy"))
			  || (userid.equalsIgnoreCase("adam")
						&& password.equalsIgnoreCase("adam@123"))
			  || (userid.equalsIgnoreCase("eve")
						&& password.equalsIgnoreCase("eve@123"))
				;
	}

}