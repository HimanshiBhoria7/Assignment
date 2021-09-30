package com.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Product;
import com.demo.serviceimplementation.*;

@RestController
public class ProductController {
	// injecting the dependencies of product implementation
	@Autowired
	ProductServiceImplementation service;

	// inserting product details like id ,name,manufacturer

	@PostMapping("/addproductdetails")
	Product addProductDetails(@RequestBody Product product) {
		Product prod = service.addProductDetails(product);
		return prod;
	}
		
	//Displaying all the list
	@GetMapping("/displayproductlist")
	ArrayList<Product> ListOfProducts(Product product) {
		ArrayList<Product> listOfProducts = service.ListOfProducts(product);
		return listOfProducts;
	}
	
	//Delete by id
	@DeleteMapping("/deletethedata/{id}")
	public void deleteProductById(@PathVariable("id")Integer id) {
		service.deleteProductById(id);
	}
	
	//displaying all the list by id
	@GetMapping("/displaybyid/{id}")
	 void viewProductById(@PathVariable("id")Integer id){
		service.viewProductById(id);
	}
	
	//Put mapping
//	@PutMapping("/updatedata/{id}")
//	Product updateOfProductById(@PathVariable("id")Integer id) {
//		Product product1 = service.updateOfProductById(id,Product data);
//		return product1;
//		
//	}
}