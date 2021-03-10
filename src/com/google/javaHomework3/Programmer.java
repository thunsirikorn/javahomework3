package com.google.javaHomework3;

public class Programmer extends Employee {
	public Programmer(String firstnameInput, String lastnameInput, int salaryInput, String positionInput) {
		super(firstnameInput, lastnameInput, salaryInput, positionInput);
	}
	
	public void createWebsite(String template, String titleName) {
		System.out.println("create website");
	}
	
	public void installWindows(String version, String productKey) {
		System.out.println("install windows");
	}
	
	public int getSalary() {
		return super.getSalary();
	}
	
	public static void main(String[] args) {
		Programmer progm = new Programmer("Nadaj","Kukimiya", 50000, "Programmer");
		System.out.println("Salary = " + progm.getSalary());
		progm.hello();
	}
}
