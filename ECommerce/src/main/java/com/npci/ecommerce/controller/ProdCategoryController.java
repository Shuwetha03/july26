package com.npci.ecommerce.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.npci.ecommerce.entity.ProductCategory;
import com.npci.ecommerce.service.ProductCategoryService;

@RestController
@RequestMapping("/category")
public class ProdCategoryController {

	@Autowired
	ProductCategoryService catServ;
	
	@GetMapping("/allcategory")
	public List<ProductCategory> findAllCat(){
		return catServ.findAllCat();
	}

}
