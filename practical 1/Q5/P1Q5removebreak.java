/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p1q5removebreak;

/**
 *
 * @author User
 */
public class P1Q5removebreak {

    public static void main(String[] args) 
    {
        	char grade ='A';
	 switch(grade)
	{
	case 'A' :
	System.out.println("Excellent!"); 
	
	case 'D' :
	System.out.println("You passed");
	case 'F' :
	System.out.println("Better try again");
	break;
	default :
	System.out.println("Invalid grade");
	}
	System.out.println("Your grade is " + grade);
    }
}
/*Excellent!
You passed
Better try again
Your grade is A
*/