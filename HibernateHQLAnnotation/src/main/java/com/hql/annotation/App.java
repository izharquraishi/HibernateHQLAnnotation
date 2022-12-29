package com.hql.annotation;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cgf.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Employee employee = new Employee("izhar", 1000.d, "IT");
		/*
		 * Employee employee1 = new Employee("dilshad", 2000.d, "Management"); Employee
		 * employee2 = new Employee("rukshar", 3000.d, "Marketting"); Employee employee3
		 * = new Employee("arkam", 4000.d, "Student"); Employee employee4 = new
		 * Employee("shahbaj", 5000.d, "Mechanical");
		 */

		Serializable save = session.save(employee);
		System.out.println(save);
		/*
		 * Serializable save2 = session.save(employee1); System.out.println(save2);
		 * Serializable save3 = session.save(employee2); System.out.println(save3);
		 * Serializable save4 = session.save(employee3); System.out.println(save4);
		 * Serializable save5 = session.save(employee4); System.out.println(save5);
		 */

		transaction.commit();

		System.out.println("Hello World!");

		session.close();

		factory.close();

	}
}
