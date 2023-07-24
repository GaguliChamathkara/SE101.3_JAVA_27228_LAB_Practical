package com.mycompany.tests;
public class Tests {

    public static void main(String[] args) 
    {
        Employee Bo = new Employee();
        Employee Bi = new Employee();
        
        Bo.setempID(1);
        Bo.setempName("Mr.Bogdan");
        Bo.setempDesignation("HR Manager");
        
        Bi.setempID(2);
        Bi.setempName("Ms.Bird");
        Bi.setempDesignation("Accountant");
        
        System.out.println("Emp ID: "+Bo.getempID());
        System.out.println("Emp Name: "+Bo.getempName());
        System.out.println("Emp Designation: "+Bo.getempDesignation());
        
        System.out.println();
        
        System.out.println("Emp ID: "+Bi.getempID());
        System.out.println("Emp Name: "+Bi.getempName());
        System.out.println("Emp Designation: "+Bi.getempDesignation());
    }
}
