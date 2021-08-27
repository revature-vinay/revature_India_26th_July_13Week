package com.login.service.impl;

import com.login.dao.UserDAO;
import com.login.dao.impl.UserDAOImpl;
import com.login.exception.BusinessException;
import com.login.model.User;
import com.login.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDAO userDAO=new UserDAOImpl();
	@Override
	public boolean isValidUserCredentials(User user) throws BusinessException {
		boolean b=false;
		if(user!=null && user.getUsername()!=null && user.getPassword()!=null && user.getUsername().matches("[A-Za-z]{3,8}[0-9]{3}") && user.getPassword().matches("[a-z]{3,8}@[0-9]{3,4}")) {
			//code here DAO
			b=userDAO.isValidUserCredentials(user);
		}else {
			throw new BusinessException("Invalid Login Credentials!!!!! Kind try Again.......... :)");
		}
		return b;
	}

}
