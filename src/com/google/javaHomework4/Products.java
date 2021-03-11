package com.google.javaHomework4;

public class Products extends AbstractProductFrontPage {
	public String price;
	public String title;
	public String urlImage;
	public String soldText;
	
	public ProductStatus.Status productStatus;
	public ProductStatus.PriceStatus priceStatus;
	
	final String quality = "very good";
	
	public Products(String price, String title, String urlImage, String soldText) {
		
	}

	public final String getX() {
		return "Good";
	}
	
	@override
	public String getTitle() {
		return null;
	}
	@override
	public String getPrice() {
		return null;
	}
	@override
	public String getUrlImage() {
		return null;
	}
	@override
	public String getSoldText() {
		return null;
	}
}
