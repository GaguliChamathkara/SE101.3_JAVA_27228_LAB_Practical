/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p1q5;

/**
 *
 * @author User
 */
public class P1Q5 {

    public static void main(String[] args) {
        
       	char grade ='A';
	 switch(grade)
	{
	case 'A' :
	System.out.println("Excellent!"); 
	break;
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
Your grade is A
*/