package com.workintech.course.developerCompany;

public class JuniorDeveloper extends Employee{
    public JuniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }
    @Override
    public void work() {
        setSalary(1500);
        System.out.println("JuniorDeveloper starts to working");
    }


}
