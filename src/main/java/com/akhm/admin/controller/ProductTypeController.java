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

import com.akhm.admin.bo.ProductTypeBO;
import com.akhm.admin.dao.model.ProductTypeTl;

@RestController
public class ProductTypeController {
	@Autowired
	private ProductTypeBO productTypeBO;

	@PostMapping("/insertproducttype")
	public ResponseEntity<Integer> saveProductType(@RequestBody ProductTypeTl productTypeTl) {
		try {
			Integer productTypeId = productTypeBO.insertProductType(productTypeTl);
			return new ResponseEntity(productTypeId, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/producttypes")
	public ResponseEntity<List<ProductTypeTl>> loadProductTypes() {
		try {
			return new ResponseEntity(productTypeBO.getProductTypes(), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);

		}
	}

	@GetMapping("/producttype")
	public ResponseEntity<ProductTypeTl> loadProductType(@PathVariable Integer productTypeId) {
		try {
			ProductTypeTl productTypeTl = productTypeBO.getProductType(productTypeId);
			return new ResponseEntity(productTypeTl, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@PostMapping("/updateproducttype")
	public ResponseEntity<Void> modifyProductType(@RequestBody ProductTypeTl productTypeTL) {
		try {
			productTypeBO.updateProductType(productTypeTL);
			return new ResponseEntity(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}