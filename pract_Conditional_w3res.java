// Questions taken from https://www.w3resource.com/java-exercises/conditional-statement/index.php

// Q1) Write a Java program to get a number from the user and print whether it is positive or negative.

import java.util.Scanner;

public class conditionals {
    public static void main(String[] args) {

        System.out.println("Enter a number : ");
        Scanner a = new Scanner(System.in);
        int a1 = a.nextInt();

        if (a1 < 0){
            System.out.println("Negative");
        }

        if (a1>0){
            System.out.println("Positive");
        }
    }
}

