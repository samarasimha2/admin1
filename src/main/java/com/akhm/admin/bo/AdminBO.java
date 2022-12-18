package com.akhm.admin.bo;

import com.akhm.admin.dao.model.AdminTl;

public interface AdminBO {
	public AdminTl getAdmin(String emailId,String password);

}
