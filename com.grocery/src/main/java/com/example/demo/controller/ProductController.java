package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.enties.Product;
import com.example.demo.service.ProductServices;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductServices productServices;

	@GetMapping("/get")
	public ResponseEntity<List<Product>> getAllProduct() {

		List<Product> products = productServices.getAllProduct();
		return new ResponseEntity<List<Product>>(products, HttpStatus.OK);

	}
    @PostMapping("/add")
	public ResponseEntity<Product> addProduct(@RequestBody Product product) {

		Product product2 = productServices.saveProduct(product);

		return new ResponseEntity<Product>(product2, HttpStatus.CREATED);

	}

}
