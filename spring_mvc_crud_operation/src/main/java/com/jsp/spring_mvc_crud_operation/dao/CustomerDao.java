package com.jsp.spring_mvc_crud_operation.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.jsp.spring_mvc_crud_operation.dto.Customer;

@Repository
public class CustomerDao {

	EntityManager entityManager = Persistence.createEntityManagerFactory("vishesh").createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	// saveCustomer method
	public Customer saveCustomer(Customer customer) {
		entityTransaction.begin();
		entityManager.persist(customer);
		entityTransaction.commit();
		return customer;
	}

	// getById method
	public Customer getById(int customerId) {
		Customer customer = entityManager.find(Customer.class, customerId);
		if (customer != null) {
			return customer;
		} else {
			return null;
		}
	}

	// updateCustomer method
	public String updateCustomer(Customer customer, int customerId) {
		Customer customer2 = getById(customerId);
		if (customer2 != null) {
			entityTransaction.begin();
			entityManager.merge(customer);
			entityTransaction.commit();
			return "data updated";
		} else {
			return "data not updated";
		}
	}

	// deleteCustomer method
	public void deleteCustomer(int customerId) {

		Customer customer = getById(customerId);
//		if (customer != null) {
			entityTransaction.begin();
			entityManager.remove(customer);
			entityTransaction.commit();
//			return "data deleted";
//		} else {
//			return "customerId not present in database";
//		}
	}

	// displayAllCustomer method
	public List<Customer> displayAllCustomer() {
		String st = "SELECT c FROM Customer c";
		Query query = entityManager.createQuery(st);
		return query.getResultList();
	}
}
