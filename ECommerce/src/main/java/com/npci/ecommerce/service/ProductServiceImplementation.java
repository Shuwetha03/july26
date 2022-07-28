package com.npci.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.npci.ecommerce.entity.Product;
import com.npci.ecommerce.repository.ProductRepository;

public class ProductServiceImplementation implements ProductService{

	@Autowired
	ProductRepository prodRepo;
	
	@Override
	public List<Product> findAllProd() {
		return prodRepo.findAllProd();
	}

	@Override
	public Product findByID(long prodId) {
		return prodRepo.findByID(prodId);
	}
}
