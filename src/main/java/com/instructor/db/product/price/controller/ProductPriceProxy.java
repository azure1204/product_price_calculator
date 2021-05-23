package com.instructor.db.product.price.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="ProductApplication",url ="http://localhost:8087")
public interface ProductPriceProxy {
	
	@GetMapping(value="/api/products_name/{name}")
	public int getByName(@PathVariable (value="name")String productName);
	

}
