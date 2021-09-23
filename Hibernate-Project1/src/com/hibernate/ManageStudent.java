package com.hibernate;

import com.hibernate.service.StudentService;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class ManageStudent {
	public static void main(String args[]) {
		StudentService studentService  = new StudentService();
		Integer empID1 = studentService.addEmployee("John","LA",342);
		
		List<Integer> listinfo = new ArrayList<Integer>();
	
		
		listinfo.add(empID1);
//		listinfo.add(empID2);

		if (listinfo.size() != 0) {
			System.out.println("*************************************Inserted******************************");
		} else {
			System.out.println("##############not Inserted########################");

		}

		/* list employee records in database */
		try {
			studentService.ListAllEmployee();
			
		} catch (Exception e) {

			e.printStackTrace();
		}

		/* update employee records in database */
		try {
			studentService.updateEmployeeDetails(4,456);
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		/* delete employee records in database by id */
//		try {
//			studentService.deleteEmployeeDetailsById(1, 555);
//		} catch (Exception e) {
//
//			e.printStackTrace();
//		}
//	}

	}

////	 static SessionFactory sessionFactoryObj;
////	   static Session sessionObj;
////	 
////	    private static SessionFactory buildSessionFactory() {
////	        // Creating Configuration Instance & Passing Hibernate Configuration File
////	        Configuration configObj = new Configuration();
////	        configObj.configure("hibernate.cfg.xml");
////	 
////	        // Since Hibernate Version 4.x, ServiceRegistry Is Being Used
////	        ServiceRegistry serviceRegistryObj = new StandardServiceRegistryBuilder().applySettings(configObj.getProperties()).build(); 
////	 
////	        // Creating Hibernate SessionFactory Instance
////	        sessionFactoryObj = configObj.buildSessionFactory(serviceRegistryObj);
////	        return sessionFactoryObj;
////	    }
////	
////	
//	
// public static void main(String[] args) {
//
////    try {
////  	   sessionObj = buildSessionFactory().openSession();
////         sessionObj.beginTransaction();
////
////    } catch (Exception me) { 
////       System.err.println("Failed to create sessionFactory object." + me);
////       
////    }
//    
//    ManageStudent ME = new ManageStudent();
//    /* Add few employee records in database */
//    Integer empID1 = ME.addStudent("Himanshi", "Ggn", 100000);//asssinged values from here
//    Integer empID2 = ME.addStudent("Komal", "Delhi", 50000);//asssinged values from here
//
//
// }
// 
// /* Method to CREATE an employee in the database   business logic*/
// public Integer addStudent(String name, String address, Integer number){
//   sessionObj = sessionFactoryObj.openSession();
//    Transaction tx = null;
//    Integer studentdetails= null;
//    
//    try {
//       tx = sessionObj.beginTransaction();
//      Student employee = new Student(name, address , number);//created the object of employee class
//       studentdetails = (Integer) sessionObj.save(employee); //save the object or insert the recording
//     
//       tx.commit();//explictiy call  the commit esure that auto commite should be false
//    }
//    catch (HibernateException e) {
//       if (tx!=null) tx.rollback();
//       e.printStackTrace(); 
//    } finally {
//  	  sessionObj.close(); 
//    }
//    return studentdetails;
// }
}