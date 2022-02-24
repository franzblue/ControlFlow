package com.perscholas.java_basics;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int x = 50;
        if (x < 10) {
            System.out.println("Less than 10");
        } else if (x > 10 && x < 20){
            System.out.println("Between 10 and 20");
        } else if (x > 20) {
            System.out.println("Greater than 20");
        }

        int y = 15;
        if (y < 10 || y > 20) {
            System.out.println("Out of range");
        } else if (y > 10 && y < 20){
            System.out.println("In range");
        }

        int grade = 90;
        if (grade < 60) {
            System.out.println("F");
        } else if (grade >= 60 && grade < 70){
            System.out.println("D");
        } else if (grade >= 70 && grade < 80) {
            System.out.println("C");
        } else if (grade >= 80 && grade < 90) {
            System.out.println("B");
        } else if (grade >= 90) {
            System.out.println("A");
        }

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter integer between 1 and 7");
        String userInput = myObj.nextLine();
        System.out.println(userInput);

        switch(userInput) {
            case "1":
                System.out.println("Sunday");
                break;
            case "2":
                System.out.println("Monday");
                break;
            case "3":
                System.out.println("Tuesday");
                break;
            case "4":
                System.out.println("Wednesday");
                break;
            case "5":
                System.out.println("Thursday");
                break;
            case "6":
                System.out.println("Friday");
                break;
            case "7":
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Out of Range");
        }

    } // main
} // class
