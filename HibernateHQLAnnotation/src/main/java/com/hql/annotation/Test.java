package com.hql.annotation;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cgf.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		/*
		 * getting all records from database using HQL Query query =
		 * session.createQuery("from Employee"); List resultList =
		 * query.getResultList(); System.out.println(resultList);
		 */

		/*
		 * getting Particular data we have pass in a parameter Using HQL Query query =
		 * session.createQuery("from Employee where name in(?1,?2)");
		 * query.setParameter(1, "izhar"); query.setParameter(2, "dilshad"); List
		 * resultList = query.getResultList(); System.out.println(resultList);
		 */

		/*
		 * this is a pagination Using HQL Query query =
		 * session.createQuery("from Employee"); query.setFirstResult(1);
		 * query.setMaxResults(3); List resultList = query.getResultList();
		 * System.out.println(resultList);
		 */

		/*
		 * delete data from data using hql Query query =
		 * session.createQuery("delete from Employee where id=1"); int executeUpdate =
		 * query.executeUpdate(); transaction.commit();
		 */

		/*
		 * Example to get total salary of all the employees Query query =
		 * session.createQuery("select sum(salary)from Employee"); List resultList =
		 * query.getResultList();
		 * 
		 * System.out.println(resultList.get(0));
		 */

		/*
		 * Example to get maximum salary of employee Query query =
		 * session.createQuery("select max(salary)from Employee"); List resultList =
		 * query.getResultList(); System.out.println(resultList);
		 */

		Query query = session.createQuery("select min(salary)from Employee");
		List resultList = query.getResultList();
		System.out.println(resultList);

	}

}
