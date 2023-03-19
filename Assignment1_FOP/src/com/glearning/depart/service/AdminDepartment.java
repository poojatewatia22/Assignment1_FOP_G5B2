package com.glearning.depart.service;


import com.glearning.depart.model.SuperDepartment;
	//inherited or subclass
	  public class  AdminDepartment extends SuperDepartment{

		@Override
		public	String departmentName() {
			String departmentName = "Admin Department";
		      return departmentName;}

		@Override
		public	String getTodaysWork() {
			String getTodaysWork = "Complete your documents Submission";
					return getTodaysWork;}

		@Override
		public	String getWorkDeadline() {
			String getWorkDeadline = " Complete by EOD ";
			      return getWorkDeadline;
		}}

	    	
	  
	    	
	    
	 
	  


