package com.mycompany.exceptionhandling2;
public class Exceptionhandling2 {

    public static void main(String[] args) {
        int []numbers = {1,2,3,4,5};
        try
        {
            int value = numbers[10];
            System.out.println("Value: "+value);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Arrsy Index error\n"+e);
        }
    }
}
