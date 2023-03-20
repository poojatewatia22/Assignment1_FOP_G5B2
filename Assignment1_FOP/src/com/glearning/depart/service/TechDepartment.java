package com.glearning.groupAssignment1.service;

import com.glearning.groupAssignment1.model.SuperDepartment;

public class TechDepartment extends SuperDepartment {
    public TechDepartment(String departmentName) {
        super(departmentName);
    }

    @Override
    public String getDepartmentName() {
        return this.departmentName;
    }

    @Override
    public String getTodayWork() {
        return "Complete coding of module 1";
    }

    @Override
    public String getWorkDeadline() {
        return "complete by EOD";
    }

    public String getTechStackInformation(){
        return "Core Java";

    }
}
