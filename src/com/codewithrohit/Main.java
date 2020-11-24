package com.codewithrohit;
// Code With Mosh Java Tutorial Part 1

import java.awt.*;
import java.util.Date; // Imports Library to use Date object from

public class Main {
// main method should always be static
    public static void main(String[] args) {
        basics();  // Chapters 1-5
        primVsRef(); // Chapter 5
        Strings(); // Chapter 6

    }

    public static void basics(){
        System.out.println("Chapter 1-5");
        byte age = 30;
        long viewsCount = 3_123_456_789L; // Use L to explain to compiler that this is a Long not Int
        float price = 10.99F;
        char letter = 'A'; // Single Letters use '' Strings use ""
        boolean isEligible = true; // or false
        Date now = new Date(); // Date


        System.out.println(now);
        System.out.println();
        System.out.println("------------");
    }

    public static void primVsRef(){
        System.out.println("Chapter 5");
        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println(y); // Y will remain as 1
        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2); // it will print [x=2, y=1] because it points to the same memory location
        System.out.println();
        System.out.println("------------");
    }

    public static void Strings(){
        System.out.println("Chapter 6");
        String message = "Hello World" + "!!";
        System.out.println(message);
        System.out.println(message.indexOf("W")); // starts at 0
        System.out.println(message.replace("!", "*")); // does not modify original string
        System.out.println(message.length());

        String captainLock = "AHHHHHHH";

        String lowerCaseHead = captainLock.toLowerCase(); // returns a lowercase version of the string

        System.out.println(lowerCaseHead); // ahhhhhhh

        String spaceGuy = " i love space ";

        String noSpaceGuy = spaceGuy.trim().replace("love", "hate");

        System.out.println(spaceGuy); //" i love space"
        System.out.println(noSpaceGuy); // "i hate space" no white spaces


        System.out.println();
        System.out.println("------------");
    }
}
