package com.hibernate.service;

import com.hibernate.*;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.util.HibernateUtil;
import com.hibernate.Student;
//import service.com.*;

public class StudentService {
	static SessionFactory sessionFactoryObj;
	static Session sessionObj;

//////////////// POST request//////////////////////////////////////////

	/* Method to CREATE an employee in the database business logic */
	public Integer addEmployee(String name, String address, int number) {

		Transaction tx = null;
		Integer studentID = null;

		try {

			sessionObj = HibernateUtil.buildSessionFactory().openSession();
			tx = sessionObj.beginTransaction();

			Student student = new Student( name , address, number);// created the object of employee class
			studentID = (Integer) sessionObj.save(student); // save the object or insert the recording

			tx.commit();// explictiy call the commit esure that auto commite should be false
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			sessionObj.close();
		}
		return studentID;
	}

//////////////// GET request//////////////////////////////////////////

// list

	/* Method to CREATE an employee in the database business logic */
	public void ListAllEmployee() {
		System.out.println(" *************from inside ListAllEmployee()********************** ");
		Transaction tx = null;
		try {

			sessionObj = HibernateUtil.buildSessionFactory().openSession();
			tx = sessionObj.beginTransaction();
// retrive logic
			List student = sessionObj.createQuery("From Student").list(); // select * from employee: "Employee refer
// Employee class
			Iterator iterator = student.iterator();
			while (iterator.hasNext()) {
				Student employee1 = (Student) iterator.next();
				System.out.println("fist name " + employee1.getName());
				System.out.println("last name " + employee1.getAddress());
				System.out.println("salary " + employee1.getNumber());
			}

			tx.commit();// explictiy call the commit esure that auto commite should be false
		} catch (

		HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			sessionObj.close();
		}
	}

// update

////////////////PUT request id//////////////////////////////////////////

	/* Method to update an employee in the database business logic */
	public void updateEmployeeDetails(Integer StudentID, int number) {
		System.out.println(" *************from inside updateEmployeeDetails()********************** ");
		Transaction tx = null;
		try {

			sessionObj = HibernateUtil.buildSessionFactory().openSession();
			tx = sessionObj.beginTransaction();
//// update logic
//
			Student student = (Student) sessionObj.get(Student.class, StudentID);

			student.setNumber(number);

			sessionObj.update(student);// hibernate will form update query automatically

			System.out.println("update sucessfully...");
			tx.commit();// explictiy call the commit esure that auto commite should be false
		} catch (	HibernateException e) {
		if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			sessionObj.close();
		}
}
//
//// delete
//
//////////////////PUT request id//////////////////////////////////////////
//
//	/* Method to update an employee in the database business logic */
//	public void deleteEmployeeDetailsById(Integer StudentId, int number) {
//		System.out.println(" *************from inside deleteEmployeeDetailsById()********************** ");
//		Transaction tx = null;
//		try {
//
//			sessionObj = HibernateUtil.buildSessionFactory().openSession();
//			tx = sessionObj.beginTransaction();
////update logic
//
//			Student student = (Student) sessionObj.get(Student.class, StudentId);
//
//			student.setNumber(number);;
//
//			sessionObj.delete(student);// hibernate will form delete query automatically
//
//			System.out.println("deleted sucessfully..." + student.getId());
//
//			tx.commit();// explictiy call the commit esure that auto commite should be false
//		} catch (
//
//		HibernateException e) {
//			if (tx != null)
//				tx.rollback();
//			e.printStackTrace();
//		} finally {
//			sessionObj.close();
//		}

//	}
}
