
package com.mycompany.exceptionhandling3;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Exceptionhandling3 {

    public static void main(String[] args) 
    {
       try
       {
           File file = new File("abc.txt");
           Scanner scanner = new Scanner(file);
           while (scanner.hasNextLine())
           {
               String line = scanner.nextLine();
               System.out.println(line);
           }
          scanner.close();
       }
       catch(FileNotFoundException e)
       {
           System.out.println("File is not there.\n"+e);
       }
        
    }
}
