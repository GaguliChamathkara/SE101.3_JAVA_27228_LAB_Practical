/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practical4_exercise3;

/**
 *
 * @author User
 */
public class Practical4_Exercise3 {

    public static void main(String[] args) 
    {
        Student st=new Student();
        st.setName("David Harry");
        st.setID(589);
        st.setCourse("Software Engineering");
        
        Lecturer l=new Lecturer();
        l.setName("John Smith");
        l.setID(452);
        l.setProgram("Computer Science");
        
        System.out.println("Student: ");
        System.out.println("Name: "+st.getName());
        System.out.println("ID: "+st.getID());
        System.out.println("Course: "+st.getCourse());
        System.out.println();
        System.out.println("Lecturer:");
        System.out.println("Name: "+l.getName());
        System.out.println("ID: "+l.getID());
        System.out.println("Programme: "+l.getProgram());
    }
}
