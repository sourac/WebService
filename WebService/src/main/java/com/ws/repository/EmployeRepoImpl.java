package com.ws.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ws.model.Emp;

@Repository
public class EmployeRepoImpl implements EmployeRepo {

	@Autowired
	private SessionFactory sessionFactory;

	private Session openSession() {
		return sessionFactory.openSession();
	}

	@Override
	public void createEmp(Emp employee) {
		// TODO Auto-generated method stub
		Session session = openSession();
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(employee);
		transaction.commit();
		session.close();
	}

	@Override
	public void updateEmp(Emp employee) {
		// TODO Auto-generated method stub
		Session session = openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(employee);
		tx.commit();
		session.close();
	}

	@Override
	public void deleteEmp(Emp employee) {
		// TODO Auto-generated method stub
		Session session = openSession();
		Transaction tx = session.beginTransaction();
		session.delete(employee);
		tx.commit();
		session.close();
	}

	@Override
	public Emp findEmployee(long id) {
		// TODO Auto-generated method stub
		Session session = openSession();
		Transaction tx = session.beginTransaction();
		Emp emp = null;
		try {
			emp = (Emp) session.get(Emp.class, id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return emp;
	}

}
