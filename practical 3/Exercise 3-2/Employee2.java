package com.mycompany.employeedetails;
public class Employee2 
{
   private String name1;
   private double basicSalary;
   private double bonus;
   
   public Employee2(String name, double bonus)
   {
       this.name = name;
       this.bonus = bonus;
   }
   
   public String getName()
   {
       return name;
   }
   
   public double getBasicSalary()
   {
       return basicSalary;
   }
   
   public double getBonus()
   {
       return bonus;
   }
   
   public double calculateBonusAmount()
   {
       return basicSalary + bonus;
   }
   
   public void setBasicSalary(double basicSalary)
   {
       this.basicSalary = basicSalary;
   }
}
