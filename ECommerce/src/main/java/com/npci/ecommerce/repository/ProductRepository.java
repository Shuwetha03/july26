package com.npci.ecommerce.repository;

import java.util.List;

import com.npci.ecommerce.entity.Product;

public interface ProductRepository {

	public List<Product> findAllProd();
	public Product findByID(long prodId);
}
