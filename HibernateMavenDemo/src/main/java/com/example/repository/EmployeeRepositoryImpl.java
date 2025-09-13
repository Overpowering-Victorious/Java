package com.example.repository;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.example.entity.Employee;

public class EmployeeRepositoryImpl {

	public void addEmployee(Employee emp) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		// Create SessionFactory obj
		SessionFactory factory = meta.getSessionFactoryBuilder().build();

		// Get session obj from session factory
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

//		// create emp and update values
//		Employee e1 = new Employee();
//		// e1.setEmpId(1002);
//		e1.setEmpName("Sam");
//		e1.setEmail("sam@example.com");
//		e1.setPassword("abc.123");

		// Save emp to db
		session.save(emp);

		// commit changes
		t.commit();

		System.out.println("Employee added successfully!");
		factory.close();
		session.close();
	}

	public void deleteEmployeeById(int empId) {
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata md=new MetadataSources(ssr).buildMetadata();
		Session s=md.buildSessionFactory().openSession();
		Transaction t=s.beginTransaction();
		
		Employee e=s.get(Employee.class,empId);
		
		if(e!=null)
		{
			s.delete(e);
			System.out.println("Employee details deleted successfully.");
		}
		else
			System.out.println("No employee data found.");
		t.commit();
		s.close();
	}
	
	public void deleteEmployeeByName(String name) {
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata md=new MetadataSources(ssr).buildMetadata();
		Session s=md.buildSessionFactory().openSession();
		Transaction t=s.beginTransaction();
		
		Query q=s.createQuery("delete from Employee where empName= :name");
		q.setParameter("name", name);
		int x=q.executeUpdate();
		
		if(x>0)
			System.out.println("Employee details deleted successfully.");
		else
			System.out.println("No employee data found.");
		t.commit();
		s.close();
	}

	public List<Employee> getAllEmployees() {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		// Create SessionFactory obj
		SessionFactory factory = meta.getSessionFactoryBuilder().build();

		// Get session obj from session factory
		Session session = factory.openSession();
		
		// Query to get list of employees
		Query query = session.createQuery("from Employee"); // HQL -
		List empList= query.getResultList();
		// close session & factory
		factory.close();
		session.close();
		
		return empList;
	}
}
