package com.akhm.admin.bo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akhm.admin.bo.AdminBO;
import com.akhm.admin.dao.AdminDAO;
import com.akhm.admin.dao.model.AdminTl;
import com.akhm.admin.exception.AdminDataCustomException;

@Service
public class AdminBOImpl implements AdminBO {
	@Autowired
	private AdminDAO adminDAO;

	@Override
	public AdminTl getAdmin(String emailId, String password) {
		try {

			return adminDAO.findByEmailIdAndPassword(emailId, password);
		} catch (Exception e) {
			throw new AdminDataCustomException(e.getMessage());
		}

	}

}