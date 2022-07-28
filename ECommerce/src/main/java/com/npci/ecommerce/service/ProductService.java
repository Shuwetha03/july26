package com.npci.ecommerce.service;

import java.util.List;

import com.npci.ecommerce.entity.Product;

public interface ProductService {

	public List<Product> findAllProd();
	public Product findByID(long prodId);
}
