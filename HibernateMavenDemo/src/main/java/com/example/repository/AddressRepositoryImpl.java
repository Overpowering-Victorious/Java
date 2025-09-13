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

import com.example.entity.Address;

public class AddressRepositoryImpl {
	
	StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	Metadata md=new MetadataSources(ssr).buildMetadata();
	SessionFactory sf=md.getSessionFactoryBuilder().build();
	
	public void addAddress(Address addr) {
		
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
		s.save(addr);
		t.commit();
		
		System.out.println("Address added successfully.");
		s.close();
	}
	
	public void deleteAddress(int addrId) {
		
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
		Address a=s.get(Address.class,addrId);
		
		if(a!=null)
		{
			s.delete(a);
			System.out.println("Address deleted.");
			t.commit();
		}
		else
			System.out.println("No address found.");
	}
	
	public void UpdateAddress(int addrId, Address newAddr) {
		
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
		Address a=s.get(Address.class,addrId);
		
		if(a!=null)
		{
			a.setCity(newAddr.getCity());
			a.setdNo(newAddr.getdNo());
			a.setState(newAddr.getState());
			a.setStreetName(newAddr.getStreetName());
			System.out.println("Address updated.");
			t.commit();
		}
		else
			System.out.println("No address found with id");
		s.close();
	}
	
	public Address getAddressById(int addrId) {
		
		Session s=sf.openSession();
		
		Address a=s.get(Address.class,addrId);
		if(a!=null)
			return a;
		return null;
	}
	
	
	public List<Address> getAllAddresses(){
		Session s=sf.openSession();
		Query q=s.createQuery("from Address");
		List res=q.getResultList();
		s.close();
		return res;
	}
	
	
	public String getCityById(int addrId) {
		Session s=sf.openSession();
		
		Address a=s.get(Address.class,addrId);
		if(a!=null)
			return a.getCity();
		return null;
	}

}
