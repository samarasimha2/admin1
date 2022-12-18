package com.akhm.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.akhm.admin.bo.ProductBO;
import com.akhm.admin.dao.model.ProductTl;

@RestController
public class ProductController {
	@Autowired
	private ProductBO productBO;

	@PostMapping("/insertproduct")
	public ResponseEntity<Integer> saveProductType(@RequestBody ProductTl productTl) {
		try {
			Integer productId = productBO.insertProduct(productTl);
			return new ResponseEntity(productId, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/products")
	public ResponseEntity<List<ProductTl>> loadProduct() {
		try {
			return new ResponseEntity(productBO.getProducts(), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);

		}
	}

	@GetMapping("/product")
	public ResponseEntity<ProductTl> loadProduct(@PathVariable Integer productId) {
		try {
			ProductTl productTl = productBO.getProduct(productId);
			return new ResponseEntity(productTl, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@PostMapping("/updateproduct") 
	public ResponseEntity<Void> modifyProductType(@RequestBody ProductTl productTL) {
		try {
			productBO.updateProduct(productTL);
			return new ResponseEntity(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}