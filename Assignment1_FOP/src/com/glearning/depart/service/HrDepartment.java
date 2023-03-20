package com.glearning.groupAssignment1.service;

import com.glearning.groupAssignment1.model.SuperDepartment;

public class HRDepartment extends SuperDepartment {
    public HRDepartment(String departmentName) {
        super(departmentName);
    }

    @Override
    public String getDepartmentName() {
        return this.departmentName;
    }

    @Override
    public String getTodayWork() {
        return "Team Lunch";
    }

    @Override
    public String getWorkDeadline() {
        return "complete by EOD";
    }

    public String doActivity(){
        return "Fill today's timesheet and mark your attendance";
    }
}
