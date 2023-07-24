package com.mycompany.test;
public class Test 
{

    public static void main(String[] args) 
    {
        Employee1 employee = new Employee1("Nick", 20, 10000.0);
        
        String name = employee.getName();
        int age = employee.getAge();
        double salary = employee.getSalary();
        
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}
