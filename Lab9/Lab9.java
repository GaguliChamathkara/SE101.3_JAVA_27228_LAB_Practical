/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab9;

import java.util.Scanner;
public class Lab9 {

    public static void main(String[] args) {
       Scanner ert=new Scanner(System.in);
       final double PI=3.1415;
        System.out.println("Enter the radius and lenght of the cycliinder: ");
        double radius=ert.nextDouble();
        double length=ert.nextDouble();
        double area=radius*radius*PI;
        double volume=area*length;
        System.out.println("The area is "+area);
        System.out.println("The volume is: "+volume);
    }
}
