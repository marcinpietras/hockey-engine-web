package com.hockeyengine.hewebapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ProductRepository {
	
	private static Logger logger = LoggerFactory.getLogger(ProductRepository.class);
	
	private Map<Long, Product> products = new HashMap<Long, Product>();
	
	public List<Product> findAll() {
		logger.info("Find all products");
		List<Product> productList = new ArrayList<Product>();
		products.forEach((k,v) -> productList.add(v));
		return productList;
	}
	
	public void save(Product product) {
		logger.info("Save product");
		products.put(product.getId(), product);
	}

}
