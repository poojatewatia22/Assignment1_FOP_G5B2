package com.glearning.groupAssignment1.service;

import com.glearning.groupAssignment1.model.SuperDepartment;

public class AdminDepartment extends SuperDepartment {
    public AdminDepartment(String departmentName) {
        super(departmentName);
    }

    @Override
    public String getDepartmentName() {
        return this.departmentName;
    }

    @Override
    public String getTodayWork() {
        return "Complete your documents Submission";
    }

    @Override
    public String getWorkDeadline() {
        return "complete by EOD";
    }
}
