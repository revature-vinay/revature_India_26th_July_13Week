package com.login.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.login.dao.UserDAO;
import com.login.dao.dbutil.MySqlDbConnection;
import com.login.exception.BusinessException;
import com.login.model.User;

public class UserDAOImpl implements UserDAO {

	@Override
	public boolean isValidUserCredentials(User user) throws BusinessException {
		boolean b=false;
		try(Connection connection=MySqlDbConnection.getConnection()){
			String sql="select username from login_master where username=? and password=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, user.getUsername());
			preparedStatement.setString(2, user.getPassword());
			
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next()) {
				b=true;
			}else {
				throw new BusinessException("Invalid Login Credentials....Kindly RETRY... :)");
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal Error Occured....Kindly contact support team");
		}
		return b;
	}

}
