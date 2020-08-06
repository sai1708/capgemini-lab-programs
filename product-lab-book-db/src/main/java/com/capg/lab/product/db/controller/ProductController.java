package com.capg.lab.product.db.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.lab.product.db.errors.ProductAlerdyExistsException;
import com.capg.lab.product.db.errors.ProductNotFoundException;
import com.capg.lab.product.db.model.Product;
import com.capg.lab.product.db.service.ProductService;


@RestController
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@PostMapping("/products")
	public Product addTrainee(@RequestBody Product product) throws ProductAlerdyExistsException {
		return service.addProduct(product);
	}
	
	@GetMapping("/products")
	public List<Product> getAllTrainees(){
		return service.getAllProducts();
	}
	
	@GetMapping("/products/id/{id}")
	public Product getTrainee(@PathVariable int id) throws ProductNotFoundException {
		return service.getProduct(id);
	}

	
	@DeleteMapping("/products/id/{id}")
	public void deleteProduct(@PathVariable int id) throws ProductNotFoundException {
		service.deleteProduct(id);
	}

}
