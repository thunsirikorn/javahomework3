package com.google.javaHomework4;

public class Main {
	public static void main(String[] args) {
	Products x = new Products("1000", "iPhone"," ","ขายไปแล้ว 10 เครื่อง");
	x.productStatus = ProductStatus.Status.DRAFT;
	x.priceStatus = ProductStatus.PriceStatus.DEAL;
	}
}
