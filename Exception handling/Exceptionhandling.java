
package com.mycompany.exceptionhandling;
import java.util.Scanner;
public class Exceptionhandling 
{

    public static void main(String[] args) 
    {
        int n1,n2,ans;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
                    n1 = sc.nextInt();
        System.out.println("Enter the second number: ");
                    n2 = sc.nextInt();
                try
                {
                    ans = n1/n2;
                    System.out.println("Answer is: "+ans);
                }
                catch(ArithmeticException e)
                {
                    System.out.println("It is an error, if the denominator zero.\n"+e);
                }
    }
}
