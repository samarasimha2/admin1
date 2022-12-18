package com.akhm.admin.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.akhm.admin.dao.model.ProductTl;
@Repository
public interface ProductDAO extends JpaRepository<ProductTl, Integer> {

}
