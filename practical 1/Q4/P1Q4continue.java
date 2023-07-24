/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p1q4continue;

/**
 *
 * @author User
 */
public class P1Q4continue {

    public static void main(String[] args)
    {
                  int [] numbers = {10, 20, 30, 40, 50};
      for(int x : numbers )
      {
         if( x == 30 )
         {
	    continue;
         }
         System.out.print( x );
         System.out.print("\n");
      }
      {
          System.out.print("I’m  out of the Loop now"); 
      }
    }
}
/*
10
20
40
50
I’m  out of the Loop now
*/