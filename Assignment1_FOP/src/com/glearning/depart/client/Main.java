package com.glearning.groupAssignment1.client;

import com.glearning.groupAssignment1.model.SuperDepartment;
import com.glearning.groupAssignment1.service.AdminDepartment;
import com.glearning.groupAssignment1.service.HRDepartment;
import com.glearning.groupAssignment1.service.TechDepartment;

public class Client {
    public static void main(String[] args) {
        SuperDepartment superDepartment = new SuperDepartment("Super") ;
        AdminDepartment adminDepartment = new AdminDepartment("Admin");
        System.out.println("Welocome to " + adminDepartment.getDepartmentName() + " Department");
        System.out.println(adminDepartment.getTodayWork());
        System.out.println(adminDepartment.getWorkDeadline());
        System.out.println(superDepartment.isTodayHoliday());
        System.out.println("-".repeat(40));

        HRDepartment hrDepartment = new HRDepartment("HR");
        System.out.println("Welcome to "+ hrDepartment.getDepartmentName() + " Department");
        System.out.println(hrDepartment.getTodayWork());
        System.out.println(hrDepartment.doActivity());
        System.out.println(hrDepartment.getWorkDeadline());
        System.out.println(superDepartment.isTodayHoliday());
        System.out.println("-".repeat(40));

        TechDepartment techDepartment = new TechDepartment("Tech");
        System.out.println("Welcome to  " + techDepartment.getDepartmentName() + " Department");
        System.out.println(techDepartment.getTodayWork());
        System.out.println(techDepartment.getWorkDeadline());
        System.out.println(techDepartment.getTechStackInformation());
        System.out.println(superDepartment.isTodayHoliday());
        System.out.println("-".repeat(40));


    }
}
