package com.jspwebapps.controllers;

import java.util.List;

import org.hibernate.Session;

import com.jspwebapps.DatabasePojos.Department;

public class DatabaseConnections {

	public static String returnDepartmentName() {

		Session session = HibernateUtil.getSessionFactory().openSession();

		try {
			session.beginTransaction();
			List<Department> department = session.createQuery("From Department").list();
			Department result = department.iterator().next();
			return (result.getDepartmentName());

		} catch (Exception e) {
			e.printStackTrace();
			return e.toString();

		} finally {
			session.close();
		}

	}
}
