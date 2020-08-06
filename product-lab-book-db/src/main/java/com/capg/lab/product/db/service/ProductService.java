package com.capg.lab.product.db.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.capg.lab.product.db.errors.ProductAlerdyExistsException;
import com.capg.lab.product.db.errors.ProductNotFoundException;
import com.capg.lab.product.db.model.Product;
import com.capg.lab.product.db.repo.ProductDataJpaRepo;

@Service
public class ProductService {
	
	@Autowired
	ProductDataJpaRepo dataJpaRepo;
	
	
	@Transactional
	public Product addProduct(Product product) throws ProductAlerdyExistsException {
		//return repo.addTrainee(trainee);
		if(dataJpaRepo.existsById(product.getProductId())){
			throw new ProductAlerdyExistsException("product already Exists");
		}
		return dataJpaRepo.save(product);
	}
	
	@Transactional
	public List<Product> getAllProducts(){
		
		
		return dataJpaRepo.findAll();
	
	}
	
	@Transactional
	public Product getProduct(int productId) throws ProductNotFoundException {
		
		if(!dataJpaRepo.existsById(productId)) {
			throw new ProductNotFoundException("Student with id: "+productId+" Not Found");
		}
		return dataJpaRepo.getOne(productId);
	}
		
	
	@Transactional
	public void deleteProduct(int productId) throws ProductNotFoundException {
		
		
		if(!dataJpaRepo.existsById(productId)) {
			throw new ProductNotFoundException("Student with id: "+productId+" Not Found");
		}
		
		dataJpaRepo.deleteById(productId);
	}


}
