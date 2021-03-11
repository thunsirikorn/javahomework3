package com.google.javaHomework4;

public abstract class AbstractProductFrontPage {
	
	public static void main(String[] args) {
		
	}
	private String title = "";
	private String description = "";
	
	public abstract String getTitle();
	public abstract String getPrice();
	public abstract String getUrlImage();
	public abstract String getSoldText();
	
	
	public void printTitle() {
		System.out.println(this.title);
	}
	public void printDescription() {
		System.out.println(this.description);
	}
	
}
