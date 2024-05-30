// QUESTIONS TAKEN FROM https://www.w3resource.com/java-exercises/basic/index.php

// Q1) Write a Java program to print 'Hello' on screen and your name on a separate line Expected Output :Hello     Alexandra Abramov

public class prac_ques_w3 {
    public static void main(String[] args) {
        System.out.println("Hello\nAlexandra Abramov");
    }
}

// Q2) Write a Java program to print the sum of two numbers.Test Data: 74 + 36

public class prac_ques_w3 {
    public static void main(String[] args) {
        System.out.println(74+36);
    }
}

// Q3) Write a Java program to divide two numbers and print them on the screen.Test Data : 50/3

public class prac_ques_w3 {
    public static void main(String[] args) {
        System.out.println(50/3);
    }
}

// Q4) Write a Java program to print the results of the following operations.Test Data:a. -5 + 8 * 6 b. (55+9) % 9 c. 20 + -3*5 / 8 d. 5 + 15 / 3 * 2 - 8 % 3 

public class prac_ques_w3 {
    public static void main(String[] args) {
        
        System.out.println(-5 + 8*6);
        System.out.println((55+9)%9);
        System.out.println(20 + -3*5 / 8);
        System.out.println(5+ 15/3 * 2 - 8 % 3);
        
    }
}

// Q5) Write a Java program that takes two numbers as input and displays the product of two numbers.

import java.util.Scanner;
public class prac_ques_w3 {
    public static void main(String[] args) {

        System.out.println("Enter number one ");
        Scanner a = new Scanner(System.in);
        float a1 = a.nextFloat();

        System.out.println("Enter number two ");
        Scanner b = new Scanner(System.in);
        float b1 = b.nextFloat();

        System.out.println("Product is "+ (a1*b1));

    }
}

// Q6) Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.

import java.util.Scanner;

public class prac_ques_w3 {
    public static void main(String[] args) {

        System.out.println("Enter number 1 : ");
        Scanner a = new Scanner(System.in);
        float a1 = a.nextFloat();

        System.out.println("Enter number 2 : ");
        Scanner b = new Scanner(System.in);
        float b1 = b.nextFloat();

        System.out.println("SUM " + (a1+b1));
        System.out.println("SUBTRACT " + (a1-b1));
        System.out.println("PRODUCT " + (a1*b1));
        System.out.println("DIVIDE " + (a1/b1));
        System.out.println("Remainder " + (a1%b1));

    }
}

// Q7) 

// Q8) Write a Java program to display the following pattern. Sample Pattern :

//   J    a   v     v  a                                                  
//   J   a a   v   v  a a                                                 
//J  J  aaaaa   V V  aaaaa                                                
// JJ  a     a   V  a     a

public class prac_ques_w3 {
    public static void main(String[] args) {

        System.out.println("   J    a   v     v  a ");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");
        
    }
}

// Q9) Write a Java program to compute the specified expressions and print the output. Test Data: ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))

public class prac_ques_w3 {
    public static void main(String[] args) {
        System.out.println((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
    }
}

// Q10) Write a Java program to compute a specified formula.Specified Formula : 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))

public class prac_ques_w3 {
    public static void main(String[] args) {
        System.out.println(4.0 * (1-(1.0/3)+(1.0/5)-(1.0/7)+(1.0/9)-(1.0/11)));
    }
}

// Q11) Write a Java program to print the area and perimeter of a circle.Test Data: Radius = 7.5

import java.util.Scanner;

public class prac_ques_w3 {
    public static void main(String[] args) {

        System.out.println("Enter radius :");

        Scanner r = new Scanner(System.in);
        float radius = r.nextFloat();

        System.out.println("Perimter is " + (2*3.14*radius));
        System.out.println("Area is " + (3.14*radius*radius));
    }
}

// Q12) Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

import java.util.Scanner;

public class prac_ques_w3 {
    public static void main(String[] args) {

        System.out.println("Enter number 1 :");
        Scanner a1 = new Scanner(System.in);
        float n1 = a1.nextFloat();

        System.out.println("Enter number 2 :");
        Scanner b1 = new Scanner(System.in);
        float n2 = b1.nextFloat();

        System.out.println("Enter number 3 :");
        Scanner c1 = new Scanner(System.in);
        float n3 = c1.nextFloat();

        System.out.println("Average :"+(n1+n2+n3)/3);

    }
}

// Q13) Write a Java program to print the area and perimeter of a rectangle.

import java.util.Scanner;

public class prac_ques_w3 {
    public static void main(String[] args) {

        System.out.println("Enter length :");
        Scanner l = new Scanner(System.in);
        float len = l.nextFloat();

        System.out.println("Enter breath :");
        Scanner b = new Scanner(System.in);
        float bre = b.nextFloat();

        System.out.println("Area is - "+(len*bre));
        System.out.println("Perimeter is - "+(2*(len+bre)));
        
    }
}

// Q14) 

// Q15) Write a Java program to swap two variables.

public class prac_ques_w3 {
    public static void main(String[] args) {
        String abc = "Hello";
        System.out.println(abc.replace("l","y"));
    }
}

// Q16) Write a Java program to print a face.

public class prac_ques_w3 {
    public static void main(String[] args) {

        System.out.println(" +\"\"\"\"\"+ ");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  | ");
        System.out.println(" | '-' | ");
        System.out.println(" +-----+");
        
    }
}

// Q17) 

// Q18) 
