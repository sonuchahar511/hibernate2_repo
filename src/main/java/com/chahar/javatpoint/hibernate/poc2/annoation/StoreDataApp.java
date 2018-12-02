package com.chahar.javatpoint.hibernate.poc2.annoation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class StoreDataApp {

	public static void main(String[] args) {
		
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("poc2_anno_hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		Employee e1 = new Employee(7,"ram7","Chawla7");
		try{
			session.save(e1);
		
		session.flush();
		t.commit();
		System.out.println("successfully saved");
		}catch(Exception e) {
			e.printStackTrace();
		}
		session.close();
		factory.close();
	}
}
