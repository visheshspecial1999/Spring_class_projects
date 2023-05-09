package com.jsp.spring_core_crud_with_annotation.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import com.jsp.spring_core_crud_with_annotation.dto.Product;
@Component
public class ProductDao {
	
	EntityManager entityManager=Persistence.createEntityManagerFactory("vishesh").createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();

	// saveProduct method
	public Product saveProduct(Product product) {
		entityTransaction.begin();
		entityManager.persist(product);
		entityTransaction.commit();
		System.out.println("data inserted");
		return product;
	}
	
	// searchProduct method
	public Product searchProduct(int productId) {
		Product product=entityManager.find(Product.class, productId);
		return	product;
	}
	
	// updateProduct method
	public String updateProduct(Product product) {
		Product product1=entityManager.find(Product.class, product.getId());
		if(product1!=null) {
			entityTransaction.begin();
			entityManager.merge(product);
			entityTransaction.commit();
			return "data updated successfully";
		}
		else {
			return "data not updated";
		}
	}
	
	// deleteProduct method
	public String deleteProduct(int productId) {
		Product product=entityManager.find(Product.class, productId);
		if(product !=null) {
			entityTransaction.begin();
			entityManager.remove(product);
			entityTransaction.commit();
			return "data deleted successfully";
		}
		else {
			return "productId not found in database";
		}
	}
	
	// displayProduct method
	public List<Product> displayAllProduct(){
		String st="select c from product c";
		Query query=entityManager.createQuery(st);
		return query.getResultList();
	}
	
	
}
