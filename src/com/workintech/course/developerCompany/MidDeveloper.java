package com.workintech.course.developerCompany;

public class MidDeveloper extends Employee{
    public MidDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }
    @Override
    public void work() {
        setSalary(2250);
        System.out.println("MidDeveloper starts to working");
    }


}
