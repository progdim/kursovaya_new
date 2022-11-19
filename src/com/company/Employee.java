package com.company;

public class Employee {

    private String fullName;
    private int iD;
    private double salary;
    private int department;


    private static int counter = 0;



    public Employee(String fullName,double salary,int department){
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        counter++;
        iD =counter;

    }

    public String getFullName() {
        return fullName;
    }

    public int getiD() {
        return iD;
    }

    public double getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }
    @Override
    public String toString(){
        return iD + " " + fullName + "; Номер отдела " + department + ": Зарплата " + salary;

    }

}

