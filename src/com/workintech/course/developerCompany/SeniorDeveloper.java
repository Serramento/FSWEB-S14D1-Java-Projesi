package com.workintech.course.developerCompany;

public class SeniorDeveloper extends Employee{
    public SeniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }
    @Override
    public void work() {
        setSalary(4000);
        System.out.println("SeniorDeveloper starts to working");
    }

}
