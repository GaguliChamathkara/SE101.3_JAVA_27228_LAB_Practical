package com.mycompany.exercise2;
public class Exercise2 {

    public static void main(String[] args) {
        Speaker sp1 = new Priest();
        sp1.speak("Bless you");
        Speaker sp2 = new Politician();
        sp2.speak("Vote me");
        Speaker sp3 = new Lecturer();
        sp3.speak("Now we are going to do a Java program");
    }
}
