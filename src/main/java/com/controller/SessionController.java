package com.controller;

import com.dao.AdminDao;
import com.dao.UserDao;

public class SessionController {

	UserDao userDao = null;
	AdminDao adminDao = null;
//

	public SessionController(UserDao userDao) {
		if (userDao == null)
			throw new IllegalArgumentException("UserDao is not initialized........");
		this.userDao = userDao;
	}
//
//	void signup() {
//		userDao.addUser();
//	}
//
//	public static void main(String[] args) {
//
//		UserDao userDao =new UserDao();
//
//		SessionController s = new SessionController(userDao);
//
//	}

	public AdminDao getAdminDao() {
		return adminDao;
	}

	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}
}
