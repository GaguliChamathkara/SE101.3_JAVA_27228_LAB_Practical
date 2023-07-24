/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p1q5ifelseif;

/**
 *
 * @author User
 */
public class P1Q5ifelseif {

    public static void main(String[] args) 
    {
        int grade = 90;
	 if(grade>85)
	{
	System.out.println("Excellent!"); 
        } 
         else if (grade>75)
        {
	System.out.println("You passed");
        } 
         else if (grade>60)
        {
	System.out.println("Better try again");
        } 
         else
        {
	System.out.println("Invalid grade");
	}
	System.out.println("Your grade is " + grade);
    }
}

/*
Excellent!
Your grade is 90
*/