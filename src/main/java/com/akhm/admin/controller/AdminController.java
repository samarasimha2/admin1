package com.akhm.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.akhm.admin.bo.AdminBO;
import com.akhm.admin.dao.model.AdminTl;

@RestController
public class AdminController {
	@Autowired
	private AdminBO adminBO;

	@PostMapping("/adminlogin")
	public ResponseEntity<AdminTl> login(@RequestBody AdminTl adminTl) {
		try {
			AdminTl admin = adminBO.getAdmin(adminTl.getEmailId(), adminTl.getPassword());
			if (admin != null) {
				return new ResponseEntity<>(admin, HttpStatus.OK);
			} else {
				return new ResponseEntity(HttpStatus.UNAUTHORIZED);
			}
		} catch (Exception e) {

			return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}