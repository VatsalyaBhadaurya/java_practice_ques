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

// Q2) Ask user to give two double input for length and breadth of a rectangle and print area type casted to int.

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

// Q3) Take name, roll number and field of interest from user and print in the format below : Hey, my name is xyz and my roll number is xyz. My field of interest are xyz.

import java.util.Scanner;

public class io_practqs {
    public static void main(String[] args) {

        System.out.println("Enter you name : ");
        Scanner n = new Scanner(System.in);
        String nm = n.nextLine();
        System.out.println(nm);

        System.out.println("Enter roll no : ");
        Scanner rn = new Scanner(System.in);
        int r = rn.nextInt();
        System.out.println(r);

        System.out.println("Enter your interests : ");
        Scanner i = new Scanner(System.in);
        String in = i.nextLine();
        System.out.println(in);

        System.out.println("Hey, my name is "+nm+" and my roll number is "+r+". My field of interest are "+in+".");

    }
}

// Q4) Take side of a square from user and print area and perimeter of it.

import java.util.Scanner;

public class io_practqs {
    public static void main(String[] args) {

        System.out.println("Enter Side of square");
        Scanner s = new Scanner(System.in);
        float sd = s.nextFloat();
        System.out.println(sd+"cm");

        System.out.println(sd*sd+"cm2 Area " + 4*sd + "cm Perimeter");
        
    }
}

// Q5) Write a program to find square of a number.

import java.util.Scanner;

public class io_practqs {
    public static void main(String[] args) {

        System.out.println("Enter number for it's square : ");
        Scanner s = new Scanner(System.in);
        float sq = s.nextFloat();
        System.out.println("Square is "+ sq*sq);
        
    }
}
