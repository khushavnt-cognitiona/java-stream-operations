package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.enties.Product;
import com.example.demo.repository.ProductRepository;

@Service
public class ProductServices {
@Autowired
ProductRepository productRepository;
	public List<Product> getAllProduct() {
		List<Product>products=productRepository.findAll();
		return products;
	}
	public Product saveProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
