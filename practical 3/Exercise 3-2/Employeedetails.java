package com.mycompany.employeedetails;
public class Employeedetails {

    public static void main(String[] args) {
        Employee2 employee = new Employee2("Bogdan", 10000);
        employee.setBasicSalary(50000);
        String name = employee.getName();
        double basicSalary = employee.getBasicSalary();
        double bonus = employee.getBonus();
        double bonusAmount = employee.calculateBonusAmount();
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Bonus Amount: " + bonusAmount);
        
    }
}
