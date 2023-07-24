
package com.mycompany.q7inheritance;

public class Q7Inheritance {

    public static void main(String[] args) {
        Item it=new Item(1,"Item one");
        System.out.println("Show the item location: "+ it.getLocation());
        System.out.println("Show the item description: "+ it.getDescription());
        it.setLocation(24);
        it.setDescription("This item is fragile.");
        System.out.println("Item number location: "+ it.getLocation());
        System.out.println("Item description: "+ it.getDescription());
        Monster mn=new Monster(32, "fyguhuih");
        System.out.println("Show the monster location: "+ mn.getLocation());
        System.out.println("Show the monster description: "+ mn.getDescription());
        
    }
}
