package com.glearning.groupAssignment1.model;

public class SuperDepartment {

    protected String departmentName;
    protected String todayWork;
    protected String workDeadline;
    protected String isTodayHoliday;
    protected String day;


    public SuperDepartment(String departmentName) {
        this.departmentName = departmentName;



    }

    public String getDepartmentName() {
        return departmentName;
    }

    public String getTodayWork() {
        return todayWork;
    }

    public String getWorkDeadline() {
        return workDeadline;
    }

    public String isTodayHoliday() {

        return "Today is not a Holiday";
    }
}
