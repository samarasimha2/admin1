package com.akhm.admin.bo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akhm.admin.bo.ProductTypeBO;
import com.akhm.admin.dao.ProductTypeDAO;
import com.akhm.admin.dao.model.ProductTypeTl;
import com.akhm.admin.exception.AdminDataCustomException;

@Service
public class ProductTypeBOImpl implements ProductTypeBO {
	@Autowired
	private ProductTypeDAO productTypeDAO;

	@Override
	public Integer insertProductType(ProductTypeTl productTypeTl) {
		try {
			if (productTypeTl != null) {
				ProductTypeTl productType = productTypeDAO.save(productTypeTl);
				return productType.getProductTypeId();
			} else {
				return 0;
			}

		} catch (Exception e) {
			throw new AdminDataCustomException(e.getMessage());
		}

	}

	@Override
	public List<ProductTypeTl> getProductTypes() {
		try {
			return productTypeDAO.findAll();
		} catch (Exception e) {
			throw new AdminDataCustomException(e.getMessage());

		}
	}

	@Override
	public ProductTypeTl getProductType(Integer productTypeId) {
		try {
			return productTypeDAO.findById(productTypeId).get();
		} catch (Exception e) {
			throw new AdminDataCustomException(e.getMessage());
		}
	}

	@Override
	public void updateProductType(ProductTypeTl productTypeTl) {
		try {
			if (productTypeTl != null) {
				productTypeDAO.save(productTypeTl);
			}
		} catch (Exception e) {
			throw new AdminDataCustomException(e.getMessage());
		}
	}

}