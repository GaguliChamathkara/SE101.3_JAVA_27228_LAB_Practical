/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testenhanceforloop;

/**
 *
 * @author User
 */
public class TestEnhanceForLoop 
{

    public static void main(String[] args) 
    {
       
         int [] numbers = {10, 20, 30, 40, 50};
      		for(int x : numbers )
                {
        			 System.out.print( x );
         			System.out.print(",");
      		}
	 System.out.print("\n");
      	String [] names ={"James", "Larry", "Tom", "Lacy"};
      		for( String name : names ) 
                {
        		 	System.out.print( name );
         			System.out.print(",");
                }
    }
}

/* In line 19, ";" is missing.
In line 22, “James” is incorrect. The correct one is "James". And there is a semi colon missing ";".
In line 28, a curly bracket is missing. "}"
*/