// Q1) Write a program to take two integer inputs from user and print sum and product of them.

import java.util.Scanner;

public class io_practqs {
    public static void main(String[] args) {

        System.out.println("Enter no 1");
        Scanner num1 = new Scanner(System.in);
        float x = num1.nextFloat();

        System.out.println("Enter no 2");
        Scanner num2 = new Scanner(System.in);
        float y = num2.nextFloat();

        double sum = x+y;
        System.out.println("Sum = "+sum);

        double prod = x*y;
        System.out.println("Product = "+prod);

    }
}

// Q2)Ask user to give two double input for length and breadth of a rectangle and print area type casted to int.

import java.util.Scanner;

public class io_practqs {
    public static void main(String[] args) {

        System.out.println("Length of rectangle ");
        Scanner l = new Scanner(System.in);
        float len = l.nextFloat();
        System.out.println(len);

        System.out.println("Breath of rectangle ");
        Scanner b = new Scanner(System.in);
        float bre = b.nextFloat();
        System.out.println(bre);

        double ar = len*bre;
        System.out.println("Area is "+ar);
        
    }
}
