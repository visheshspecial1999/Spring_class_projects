package com.jsp.spring_core_crud_with_annotation.controller;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.spring_core_crud_with_annotation.Myconfig;
import com.jsp.spring_core_crud_with_annotation.dto.Product;
import com.jsp.spring_core_crud_with_annotation.service.ProductService;

public class ProductInsertController {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		ApplicationContext applicationContex = new AnnotationConfigApplicationContext(Myconfig.class);
		Product product = (Product) applicationContex.getBean("product");
		ProductService productService = (ProductService) applicationContex.getBean("productService");
		while(true) {
			System.out.println();
		System.out.println("1.Insert\n2.Search\n3.Update\n4.Delete\n5.Display");
		System.out.print("enter your choice: ");
		int choice = s.nextInt();
		switch (choice) {
		case 1: {
			System.out.println("enter productId: ");
			product.setId(s.nextInt());
			System.out.println("enter productName: ");
			product.setName(s.next());
			System.out.println("enter productPrice: ");
			product.setPrice(s.nextDouble());
			productService.saveProduct(product);
		}
			break;

		case 2: {
			System.out.println("enter productId: ");
			Product product1=productService.searchProduct(s.nextInt());
			if(product!=null) {
			System.out.println("productId: "+product1.getId());
			System.out.println("productName: "+product1.getName());
			System.out.println("productPrice: "+product1.getPrice());
			}
			else {
				System.out.println("productId is not present in database");
			}
		}
			break;
		case 3: {
			System.out.println("enter productId: ");
			product.setId(s.nextInt());
			System.out.println("enter productName: ");
			product.setName(s.next());
			System.out.println("enter productPrice: ");
			product.setPrice(s.nextDouble());
			productService.updateProduct(product);
		}
			break;
		case 4: {
			System.out.println("enter productId: ");
			System.out.println(productService.deleteProduct(s.nextInt()));
		}
			break;
		case 5: {
			List<Product> list=productService.displayAllProduct();
			for (Product product2 : list) {
				System.out.println("------------product_details-------------");
				System.out.println("Id: "+product2.getId());
				System.out.println("Name: "+product2.getName());
				System.out.println("Price: "+product2.getPrice());
				System.out.println();		
			}
		}
			break;
		case 6: {
			System.out.println("system closed successfully");
			System.exit(choice);
		}
			break;
		default: {
			System.out.println("invalid choice try again...");
		}
		}
		}
	}
}