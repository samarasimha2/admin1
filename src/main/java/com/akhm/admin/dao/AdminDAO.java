package com.akhm.admin.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.akhm.admin.dao.model.AdminTl;
@Repository
public interface AdminDAO extends JpaRepository<AdminTl, Integer> {
	public AdminTl findByEmailIdAndPassword(String emailId,String password);

}
