package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.UserBean;
import com.controller.AdminController;
import com.controller.UserController;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		// UserController userController = new UserController();
		// userController.print();

		// ioc -> -> class object
		// spring.xml
		// spring - ioc container --> spring bean

		// ioc container ->

		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println(container);

		UserController userController = container.getBean("uc", UserController.class);
		userController.print();

		AdminController adminController = container.getBean("ac", AdminController.class);
		adminController.print();

		UserController userController1 = container.getBean("uc", UserController.class);
		UserController userController2 = container.getBean("uc", UserController.class);
		UserController userController3 = container.getBean("uc", UserController.class);

		System.out.println(userController1);
		System.out.println(userController2);
		System.out.println(userController3);

		UserBean userBean = container.getBean("userBean", UserBean.class);
		System.out.println(userBean);
		System.out.println(userBean.getFirstName());

		// singleton design pattern

	}
}
