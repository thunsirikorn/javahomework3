package com.google.javaHomework3;

import com.google.javaHomework4.IWebsiteCreator;

public class CEO extends Employee {
	public CEO(String firstnameInput, String lastnameInput, int salaryInput, String positionInput) {
		super(firstnameInput, lastnameInput, salaryInput, positionInput);
	}
	
	public void orderWebsite(IWebsiteCreator creator) {
		creator.createWebsite("some template", "Codecamp3");
		}
		
	@Override
	public int getSalary() {
		return  super.getSalary() * 2;
	}
	
	public void hello() {
		System.out.println("Hi, nice to meet you. " + this.firstname + "!");
	}
	
	public void fire(Employee employee) {
		System.out.println(employee.firstname + " has been fired!");
	}

	public static void main(String[] args) {
		Employee dang = new Employee("Dang", "Red", 10000, "Manager");
		System.out.println(dang.getSalary());
		dang.hello();
		
		CEO ceo = new CEO("Somchai", "Sudlor", 30000, "COO");
			System.out.println(ceo.getSalary());
			ceo.hello();
			ceo.fire(dang);
	}
}
