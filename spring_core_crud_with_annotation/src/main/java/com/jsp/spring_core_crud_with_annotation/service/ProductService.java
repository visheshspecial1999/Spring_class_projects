package com.jsp.spring_core_crud_with_annotation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.spring_core_crud_with_annotation.dao.ProductDao;
import com.jsp.spring_core_crud_with_annotation.dto.Product;

@Component(value = "productService")
public class ProductService {
	
	@Autowired
	ProductDao productDao;
//	=new ProductDao();
	// saveProduct method
		public Product saveProduct(Product product) {
			return productDao.saveProduct(product);
		}
		// searchProduct method
		public Product searchProduct(int productId) {
		return productDao.searchProduct(productId);
		}
		
		// updateProduct method
		public String updateProduct(Product product) {
			return productDao.updateProduct(product);
		}
		
		// deleteProduct method
		public String deleteProduct(int productId) {
			return productDao.deleteProduct(productId);
		}
		
		// displayProduct method
		public List<Product> displayAllProduct(){
			return productDao.displayAllProduct();
		}
}
