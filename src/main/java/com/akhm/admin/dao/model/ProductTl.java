package com.akhm.admin.dao.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCT_TL")
public class ProductTl {
	@Id
	@Column(name="PRODUCT_ID")
	@GeneratedValue
	private Integer productId;
	@Column(name="PRODUCT_TYPE_ID")
	private Integer productTypeId;
	@Column(name="PRODUCT_NAME")
	private String productName;
	@Column(name="PRODUCT_DESCRIPTION")
	private String productDescription;
	@Column(name="PRODUCT_PRICE")
	private double productPrice;
	@Column(name="PRODUCT_MANUFACTURE_DATE")
	private Date productManufactureDate;
	@Column(name="PRODUCT_EXPIRY_DATE")
	private Date productExpiryDate;
	@Column(name="PRODUCT_STATUS")
	private String productStatus;
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Integer getProductTypeId() {
		return productTypeId;
	}
	public void setProductTypeId(Integer productTypeId) {
		this.productTypeId = productTypeId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public Date getProductManufactureDate() {
		return productManufactureDate;
	}
	public void setProductManufactureDate(Date productManufactureDate) {
		this.productManufactureDate = productManufactureDate;
	}
	public Date getProductExpiryDate() {
		return productExpiryDate;
	}
	public void setProductExpiryDate(Date productExpiryDate) {
		this.productExpiryDate = productExpiryDate;
	}
	public String getProductStatus() {
		return productStatus;
	}
	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}
	

}
