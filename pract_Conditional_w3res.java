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

// Q3) Write a Java program that takes three numbers from the user and prints the greatest number.

import java.util.Scanner;

public class conditionals {
    public static void main(String[] args) {

        System.out.println("Enter num1 :");
        Scanner n = new Scanner(System.in);
        float n1 = n.nextFloat();

        System.out.println("Enter num2 :");
        Scanner l = new Scanner(System.in);
        float n2 = l.nextFloat();

        System.out.println("Enter num3 :");
        Scanner m = new Scanner(System.in);
        float n3 = m.nextFloat();

        if (n1 == n2 && n2 == n3 && n3 == n1){
            System.out.println("All are equal");
        }

        if (n1 > n2 && n2 > n3 && n3 < n1){
            System.out.println(n1+" Is greatest");
        }

        if (n2 > n1 && n1 > n3 && n3 < n2){
            System.out.println(n2+" is greatest");
        }

        if (n3 > n1 && n1 > n2 && n2 < n3){
            System.out.println(n3+" is greatest");
        }

        if (n3 > n1 && n2 > n1 && n1 < n3){
            System.out.println(n3+" is greatest");
        }
        
    }
}

// Q4) Write a Java program that reads a floating-point number and prints "zero" if the number is zero. Otherwise, print "positive" or "negative"

import java.util.Scanner;

public class conditionals {
    public static void main(String[] args) {

        System.out.println("Enter a number :");
        Scanner f = new Scanner(System.in);
        float fs = f.nextFloat();

        if (fs == 0){
            System.out.println("Zero");
        }

        if (fs < 0){
            System.out.println("Negative");
        }

        if (fs > 0){
            System.out.println("Positive");
        }
        
    }
}

// Q5) Write a Java program that takes a number from the user and generates an integer between 1 and 7. It displays the weekday name.

import java.util.Scanner;

public class conditionals {
    public static void main(String[] args) {

        System.out.println("Enter a number from 1-7 : ");
        Scanner n = new Scanner(System.in);
        int nd = n.nextInt();

        if (nd<1 || nd>7){
            System.out.println("Number not in range");
        }

        if (nd == 1 ){
            System.out.println("Monday");
        }

        if (nd == 2){
            System.out.println("Tuesday");
        }

        if (nd == 3){
            System.out.println("Wednesday");
        }

        if (nd == 4){
            System.out.println("Thrusday");
        }

        if (nd == 5){
            System.out.println("Friday");
        }

        if (nd == 6){
            System.out.println("Saturday");
        }

        if (nd == 7){
            System.out.println("Sunday");
        }

    }
}

// Q7) Write a Java program to find the number of days in a month.

import java.util.Scanner;

public class conditionals {
    public static void main(String[] args) {

        System.out.println("Enter month number :");
        Scanner m = new Scanner(System.in);
        int mn = m.nextInt();
        System.out.println("Enter year");
        int yr = m.nextInt();

        if (yr%4==0 && mn == 2){
            System.out.println("February "+yr+" has 29 days");
        }

        if (yr%4!=0 && mn == 2){
            System.out.println("February "+yr+" has 28 days");
        }

        if (mn == 1){
            System.out.println("January "+yr+" has 31 days");
        }

        if (mn == 3){
            System.out.println("March "+yr+" has 31 days");
        }

        if (mn == 4){
            System.out.println("April "+yr+" has 30 days");
        }

        if (mn == 5){
            System.out.println("May "+yr+" has 31 days");
        }

        if (mn == 6){
            System.out.println("June "+yr+" has 30 days");
        }

        if (mn == 7){
            System.out.println("July "+yr+" has 31 days");
        }

        if (mn == 8){
            System.out.println("August "+yr+" has 31 days");
        }

        if (mn == 9){
            System.out.println("September "+yr+" has 30 days");
        }

        if (mn == 10){
            System.out.println("October "+yr+" has 31 days");
        }

        if (mn == 11){
            System.out.println("November "+yr+" has 30 days");
        }

        if (mn == 12){
            System.out.println("December "+yr+" has 31 days");
        }

    }
}
