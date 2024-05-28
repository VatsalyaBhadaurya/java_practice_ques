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

// Q6) Take two different string input and print them in same line.

import java.util.Scanner;

public class io_practqs {
    public static void main(String[] args) {

        System.out.println("Enter string 1:");
        Scanner a = new Scanner(System.in);
        String a1 = a.next();

        System.out.println("Enter string 1:");
        Scanner b = new Scanner(System.in);
        String b1 = b.next();

        System.out.println(a1+b1);
    }
}

// Q7) *IMP QUES* Take 3 inputs from user and check :all are equal AND any of two are equal

public class io_practqs {
    public static void main(String[] args) {

        System.out.println("Enter 1st input :");
        Scanner a = new Scanner(System.in);
        int a1 = a.nextInt();

        System.out.println("Enter 2nd input :");
        Scanner b = new Scanner(System.in);
        int b2 = b.nextInt();

        System.out.println("Enter 3rd input :");
        Scanner c = new Scanner(System.in);
        int c3 = c.nextInt();

        System.out.println(a1==b2&&b2==c3&&c3==a1);
        System.out.println(a1==b2||b2==c3||c3==a1);
        
    }
}

// Q8) Write a program to enter the values of two variables 'a' and 'b' from keyboard and then check if both the conditions 'a < 50' and 'a < b' are true.

import java.util.Scanner;

public class io_practqs {
    public static void main(String[] args) {

        System.out.println("Enter variable a :");
        Scanner a = new Scanner(System.in);
        int a1 = a.nextInt();
        System.out.println("Enter variable b :");
        int b1 = a.nextInt();

        System.out.println("A less than 50 - "+(a1<50)+", A less than B - "+(a1<b1));

    }
}

// Q9) If the marks of Robert in three subjects are entered through keyboard (each out of 100 ), write a program to calculate his total marks and percentage marks.

import java.util.Scanner;

public class io_practqs {
    public static void main(String[] args) {

        Scanner subs = new Scanner(System.in);
        System.out.println("Enter marks in subject 1: ");
        float a = subs.nextFloat();
        System.out.println("Enter marks in subject 2: ");
        float b = subs.nextFloat();
        System.out.println("Enter marks in subject 3: ");
        float c = subs.nextFloat();

        System.out.println("Total marks - "+(a+b+c)+" & Percentage is "+((((a+b+c)/300)*100))+"%");
        
    }
}
