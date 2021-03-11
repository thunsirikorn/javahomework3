package com.google.javaHomework4;

import java.util.ArrayList;

import com.google.javaHomework3.CEO;
import com.google.javaHomework3.Employee;
import com.google.javaHomework3.Programmer;

public class CastingClass {
	public static void main(String[] args) {
		Employee dang = new Employee("Dang","Red",10000,"Staff");
		Employee ceo = new CEO("Captain","Marvel",30000,"CEO");
		Programmer prog = new Programmer("Captain","Marvel",20000,"Programmer");
		CEO ceo2 = (CEO) ceo;
		
		ArrayList<Employee> myList = new ArrayList<>();
		myList.add(ceo2);
		myList.add(dang);
		myList.add(prog);
		
		CEO ceo3 = (CEO) myList.get(0);
		Employee dang2 = myList.get(1);
		Programmer prog2 = (Programmer) myList.get(2);
				   ceo3.hello();
				   prog2.hello();

	}
	
	
	
}
