package com.salesmanager.shop.commons.entity.catalog.product;

import com.salesmanager.shop.commons.model.entity.EntityList;

import java.util.ArrayList;
import java.util.List;

public class ProductList extends EntityList {
	

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7267292601646149482L;
	private List<Product> products = new ArrayList<Product>();
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}


}
