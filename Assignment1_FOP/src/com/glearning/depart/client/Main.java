package com.glearning.depart.client;

import com.glearning.depart.service.TechDepartment;
import com.glearning.depart.model.SuperDepartment;
import com.glearning.depart.service.AdminDepartment;
import com.glearning.depart.service.HrDepartment;
//Driver class
public class Main {
	public static void main(String[] args) {
		//creating object or instance
		SuperDepartment obj = new SuperDepartment();//creating an object of super department
		AdminDepartment obj1 = new AdminDepartment();//creating an object of admin department
		HrDepartment obj2 = new HrDepartment();//creating an object of hr department
		TechDepartment obj3 = new TechDepartment();//creating an object of tech department
		//method calling to super department 
		System.out.println("Welcome to "+obj.departmentName());
		System.out.println(obj.getTodaysWork());
		System.out.println(obj.getWorkDeadline());
		System.out.println(obj.isTodayAHoliday());
		
		System.out.println();
		
		//method calling to admin department
		System.out.println("Welcome to "+obj1.departmentName());
		System.out.println(obj1.getTodaysWork());
		System.out.println(obj1.getWorkDeadline());
		
		System.out.println();
		//method calling to hr department
		System.out.println("Welcome to "+obj2.departmentName());
		System.out.println(obj2.getTodaysWork());
		System.out.println(obj2.getWorkDeadline());
		System.out.println(obj2.doActivity());
		
		System.out.println();
		//method calling tech department
		System.out.println("Welcome to "+obj3.departmentName());
		System.out.println(obj3.getTodaysWork());
		System.out.println(obj3.getWorkDeadline());
		System.out.println(obj3.getTechStackInformation());
		
		
		
		
		
		
		
}
}