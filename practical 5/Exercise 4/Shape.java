package com.mycompany.exercise5;
abstract public class Shape 
{
   double area;
   abstract double calculateArea();
   
   public void display()
   {
       System.out.println(area);
   }
} 

class Circle extends Shape
    {
        double r;
        public Circle(int r)
        {
            this.r = r;
        }
        double calculateArea()
        {
            final double p=3.1415;
            area=p*r*r;
            return area;
        }
    }

class Rectangle extends Shape
{
    double x;
    double y;
    public Rectangle(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    double calculateArea()
    {
        area=x*y;
        return area;
    }
}
