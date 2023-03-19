package com.glearning.depart.service;

import com.glearning.depart.model.SuperDepartment;
//inherited or subclass
 public class   TechDepartment extends SuperDepartment{

			@Override
			public	String departmentName() {
				System.out.println("Welcome to Tech department");
				String departmentName = "Tech Department";
				return departmentName;
			}

			@Override
			public String getTodaysWork() {
				String getTodaysWork =" Complete coding of module 1";
				return getTodaysWork;
			}

			@Override
			public String getWorkDeadline() {
				String getWorkDeadline = "Complete by EOD";
				return getWorkDeadline;
			}

			@Override
			public String getTechStackInformation() {
				String getTechStackInformation = "core java";
				return getTechStackInformation ;
			}
		  }


