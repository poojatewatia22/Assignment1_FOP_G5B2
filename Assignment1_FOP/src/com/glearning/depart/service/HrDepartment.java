package com.glearning.depart.service;

import com.glearning.depart.model.SuperDepartment;

//inherited or subclass
    
	public  class  HrDepartment extends SuperDepartment{

		@Override
		public	String departmentName() {
			
		String departmentName ="Hr Department";
			return departmentName;
		}

		@Override
		public	String getTodaysWork() {
			String getTodaysWork = " Fill today’s timesheet and mark your attendance";
				
			return getTodaysWork;
		}

		@Override
		public	String getWorkDeadline() {
			String getWorkDeadline ="Complete by EOD ";
			return  getWorkDeadline;
		}

		@Override
		public	String doActivity() {
			String doActivity = "team lunch";
			return  doActivity;
		}}


