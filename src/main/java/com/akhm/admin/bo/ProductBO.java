package com.akhm.admin.bo;

import java.util.List;

import com.akhm.admin.dao.model.ProductTl;

public interface ProductBO {
	public Integer insertProduct(ProductTl productTl);

	public List<ProductTl> getProducts();

	public ProductTl getProduct(Integer productId);

	public void updateProduct(ProductTl productTl);

}