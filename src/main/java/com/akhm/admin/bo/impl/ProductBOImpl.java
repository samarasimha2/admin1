package com.akhm.admin.bo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akhm.admin.bo.ProductBO;
import com.akhm.admin.dao.ProductDAO;
import com.akhm.admin.dao.model.ProductTl;
import com.akhm.admin.exception.AdminDataCustomException;

@Service
public class ProductBOImpl implements ProductBO {
	@Autowired
	private ProductDAO productDAO;

	@Override
	public Integer insertProduct(ProductTl productTl) {
		try {
			if (productTl != null) {
				ProductTl product = productDAO.save(productTl);
				return product.getProductId();
			} else {
				return 0;
			}

		} catch (Exception e) {
			throw new AdminDataCustomException(e.getMessage());
		}

	}

	@Override
	public List<ProductTl> getProducts() {
		try {
			return productDAO.findAll();
		} catch (Exception e) {
			throw new AdminDataCustomException(e.getMessage());

		}
	}

	@Override
	public ProductTl getProduct(Integer productId) {
		try {
			return productDAO.findById(productId).get();
		} catch (Exception e) {
			throw new AdminDataCustomException(e.getMessage());
		}
	}

	@Override
	public void updateProduct(ProductTl productTl) {
		try {
			if (productTl != null) {
				productDAO.save(productTl);
			}
		} catch (Exception e) {
			throw new AdminDataCustomException(e.getMessage());
		}
	}

}