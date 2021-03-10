package com.google.javaHomework3;

public class Employee {
	public String firstname;
	public String lastname;
	private int salary;
	
	//homework 13.2  เพิ่มตัวแปร
	public String position;
	
	
	public Employee(String firstnameInput, String lastnameInput, int salaryInput, String positionInput) {
		firstname = firstnameInput;
		lastname = lastnameInput;
		salary = salaryInput;
		position = positionInput;
	}
	
	public void hello() {
		System.out.println("Hello " + this.firstname );
		}
	
	public int getSalary() {
		return salary;
	}
	
	//homework 13.2 เขียน method เพิ่ม
	public void checkPosition() {
		System.out.println("My Position is " + position);
	}
	
	public void getFullname() {
		System.out.println("Full name : " + firstname +"  "+ lastname);
	}
	
	public static void main(String[] args) {
		Employee[] employees = new Employee[3];
		for(int i=0; i < employees.length; i++) {
			employees[i] = new Employee("name"+i, "lastname"+i, i*10000, "postion"+i);
		}
		System.out.println(employees[1].firstname);
		System.out.println(employees[2].firstname);
		System.out.println(employees[1].getSalary());
		System.out.println(employees[2].getSalary());
	
		//homework 13.2 ทดสอบ checkPosition
		Employee em1 = new Employee("Yaya","Uratsaya",30000,"CEO");
		test();
		em1.checkPosition();
		
		//homework 13.2  สร้าง employee 2 
		Employee em2 = new Employee("Bank","Tanatip",20000,"IT");
		em2.getFullname();
	}
	
	//homework 13.2 ทดสอบ checkPosition
	public static void test() {
		System.out.println("This is static method");
	}
	
}
