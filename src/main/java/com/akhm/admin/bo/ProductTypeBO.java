package com.akhm.admin.bo;

import java.util.List;

import com.akhm.admin.dao.model.ProductTypeTl;

public interface ProductTypeBO {
	public Integer  insertProductType(ProductTypeTl productTypeTl);
	public List<ProductTypeTl> getProductTypes();
	public ProductTypeTl getProductType(Integer productTypeId);
	public void updateProductType(ProductTypeTl productTypeTl);

}