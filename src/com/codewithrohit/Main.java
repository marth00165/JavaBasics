package com.codewithrohit;
// Code With Mosh Java Tutorial Part 1

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date; // Imports Library to use Date object from
import java.util.Scanner;

public class Main {
// main method should always be static
    public static void main(String[] args) {
//        basics();  // Chapters 1-5
//        System.out.println("\n------------");
//        primVsRef(); // Chapter 5
//        System.out.println("\n------------");
//        Strings(); // Chapter 6-7
//        System.out.println("\n------------");
//        arrayFunctions(); // Chapter 8-9
//        System.out.println("\n------------");
//        Constants(); // Chapter 10
//        System.out.println("\n------------");
//        arithmeticExpressions(); // Chapter 11-12
//        System.out.println("\n------------");
//        Casting(); // Chapter 13
//        System.out.println("\n------------");
//        numberStuff(); // Chapter 14-15
//        System.out.println("\n------------");
//        readingUserInput(); // Chapter 16
//        System.out.println("\n------------");
        mortgageCalculator(); // Project
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
    }

    public static void Strings(){
        System.out.println("Chapter 6-7");
        String message = "Hello World" + "!!";
        System.out.println(message);
        System.out.println(message.indexOf("W")); // starts at 0
        System.out.println(message.replace("!", "*")); // does not modify original string
        System.out.println(message.length());

        String captainLock = "AHHHHHHH";

        String lowerCaseHead = captainLock.toLowerCase(); // returns a lowercase version of the string

        System.out.println(lowerCaseHead); // ahhhhhhh

        String spaceGuy = " i \"love\" space "; // Escape Sequence

        String twoLinez = "Line 1 \nLine 2";

        String noSpaceGuy = spaceGuy.trim().replace("love", "hate");



        System.out.println(spaceGuy); //" i "love" space"
        System.out.println(noSpaceGuy); // "i hate space" no white spaces
        System.out.println(twoLinez); // prints 2 separate lines
    }

    public static void arrayFunctions(){
        System.out.println("Chapter 8-9");
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;

        int[] moNumbers = {2, 1, 5, 4, 6}; // arrays have fixed length

        System.out.println(moNumbers.length);


        Arrays.sort(moNumbers);

        String updatedArray = Arrays.toString(moNumbers);


        System.out.println(updatedArray);

        int[][] twoDArr = {{1,2,3}, {4,5,6}};

        System.out.println(Arrays.deepToString(twoDArr));
    }

    public static void Constants(){
        System.out.println("Chapter 10");

        final float pi = 3.14F;

        System.out.println(pi);
        // Now pi can never be changed
    }

    public static void arithmeticExpressions(){
        System.out.println("Chapter 11-12");
        int result = 10 + 3; // Same operators as any language
        System.out.println(result);
        double result2 = 10.0 / 3.0; // decimals require double
        System.out.println(result2);

        int x = 1;
        x++; // x = 2
        System.out.println("X: " + x); // increments

        int y = x++; // y = 2, x = 3

        System.out.println("X: " + x + "\nY: " + y);

        int z = ++x; // z = 4, x = 4

        System.out.println("X: " + x + "\nZ: " + z);

        x+= 2; // x = 6 this works for *, /, -

        System.out.println("X: " + x);

        System.out.println("\n ----Order of Operations----");

        x = 10 + 3 * 2; // x = 16 follows same BODMAS operations order

        System.out.println("X: " + x);

        x = (10 + 3) * 2; // x = 26

        System.out.println("X: " + x);
    }

    public static void Casting(){
        System.out.println("Chapter 13");
        //Implicit casting
        //byte > short > int > long > float > double
        double x = 1.1;
        double y = x+2;

        System.out.println(y);

        // Explicit casting
        int z = (int)x +2 ;
        System.out.println(z);

        // Wrapping
        String a = "1";
        System.out.println(Integer.parseInt(a) + 2);
    }

    public static void numberStuff(){
        System.out.println("Chapter 14-15");
        int result = Math.round(1.1F);

        System.out.println(result);

        int ceiling = (int)Math.ceil(1.1F); // also has 4
        System.out.println(ceiling);

        int max = Math.max(1,2); // also has min
        System.out.println(max);

        int random = (int)(Math.random() * 100); // random whole number 0-100
        System.out.println(random);

        // Format Numbers

        String money = NumberFormat.getPercentInstance().format(0.1);

        System.out.println(money); // Formats number as percent
    }

    public static void readingUserInput(){
        System.out.println("Chapter 16");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        String name = scanner.nextLine().trim();

        System.out.print("Age: ");
        byte age = scanner.nextByte();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
    }

    public static void mortgageCalculator(){
        System.out.println("Rohit's Mortgage Calculator");

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;


        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float yearlyRate = scanner.nextFloat();
        float monthlyRate = yearlyRate/PERCENT/MONTHS_IN_YEAR;

        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();
        int totalMonths = years*MONTHS_IN_YEAR;

        double topEquation = monthlyRate*(Math.pow((1+monthlyRate), totalMonths));
        double bottomEquation = Math.pow((1 + monthlyRate), totalMonths) - 1;

        double unformattedMortgage = principal * topEquation/bottomEquation;


        String formattedMortgage = NumberFormat.getCurrencyInstance().format(unformattedMortgage);

        System.out.println("Mortgage: " + formattedMortgage);
    }






}
