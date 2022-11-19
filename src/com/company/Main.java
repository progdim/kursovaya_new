package com.company;

public class Main {

    private static Employee[] employees;




    public static void main(String[] args) {
        employees = new Employee[10];
        employees[0] = new Employee("Сергеев Николай Иванович", 32100.12,5);
        employees[1] = new Employee("Петров Василий Аркадьевич", 24500,2);
        employees[2] = new Employee("Печко Михайил Михайлович", 40500,4);
        printArray();

        System.out.println("Суммма зарплат работнгиков: " + sumSalary());
        System.out.println("Сотрудник с мин ЗП " + employeeMinSalary());
        System.out.println("Сотрудник с макс ЗП " + employeeMaxSalary());
        System.out.println("Средняя зп сотрудников " + averageSalary());
        printFullName();
    }


    public static void printArray() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].toString());
            }
        }
    }


    public static double sumSalary (){
        double result = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                result += employees[i].getSalary();
            }
        }
        return result;
    }

    public static Employee employeeMinSalary(){
        Employee result = employees[0];
        double min = Double.POSITIVE_INFINITY;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < min) {
                min = employees[i].getSalary();
                result = employees[i];
            }
        }
        return result;
    }


    public static Employee employeeMaxSalary(){
        Employee result = employees[0];
        double max = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() > max) {
                max = employees[i].getSalary();
                result = employees[i];
            }
        }
        return result;
    }


    public static double averageSalary() {
        int caunter = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                caunter++;
            }
        }
        return sumSalary() / caunter;
    }


    public static void printFullName () {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getFullName());
            }
        }
    }


}

