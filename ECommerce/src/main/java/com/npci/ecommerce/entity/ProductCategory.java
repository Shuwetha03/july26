package com.npci.ecommerce.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="product")
public class ProductCategory {

	@Id
	@Column(name="categoryid")
	private String categoryId;
	
	@Column(name="categoryName")
	private long categoryName;

	public ProductCategory() {
		
	}
	
	public ProductCategory(String categoryId, long categoryName) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public long getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(long categoryName) {
		this.categoryName = categoryName;
	}
	
	
}
