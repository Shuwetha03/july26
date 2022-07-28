package com.npci.ecommerce.repository;

import java.util.List;

import com.npci.ecommerce.entity.ProductCategory;

public interface ProdCategoryRepository {

	public List<ProductCategory> findAllCat();
}
