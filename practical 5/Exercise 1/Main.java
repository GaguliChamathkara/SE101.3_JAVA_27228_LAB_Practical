/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author User
 */
public class Main 
{

    public static void main(String[] args) 
    {
       InterfaceImplemented rt= new InterfaceImplemented();
       rt.display();
    }
}

//Question1 -> answer. No, because inside an interface by default are public static void.
//Question2 -> answer. No, because all the methods are inside an interface are abstract by the default.
//Question3 -> answer. No, if a variable is final, then it cannot change other than the value assigned in intialization.