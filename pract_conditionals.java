// Q1) Java program to check wheter a student is pass or not, min 33 % and 40% overall, input from user

import java.util.Scanner;

public class conditionals {
    public static void main(String[] args) {

        System.out.println("Enter marks in sub1 :");
        Scanner n1 = new Scanner(System.in);
        float num1 = n1.nextFloat();

        System.out.println("Enter marks in sub2 :");
        Scanner n2 = new Scanner(System.in);
        float num2 = n2.nextFloat();

        System.out.println("Enter marks in sub3 :");
        Scanner n3 = new Scanner(System.in);
        float num3 = n3.nextFloat();

        if (num1>=33){
            System.out.println("pass in sub1");
        }

        if (num2>=33){
            System.out.println("pass in sub2");
        }

        if (num3>=33){
            System.out.println("pass in sub3");
        }

        float tp = (((num1+num2+num3)/300)*100);

        if (tp>=40 && num1>=33 && num2>=33 && num3>=33){
            System.out.println("Passed overall");
        }

        else {
            System.out.println("Failed lamo");
        }

        }

    }

// Q2) Calculate IT paid by employee acc to tax slabs, take income as input 

import java.util.Scanner;

public class conditionals {
    public static void main(String[] args) {

        System.out.println("Enter income :");
        Scanner I = new Scanner(System.in);
        Float in = I.nextFloat();

        if (in<2.5){
            System.out.println("You are not taxable!");
        }

        if (in>=2.5 && in<=5){
            System.out.println("Tax to be paid is "+(in*(0.05)));
        }

        if (in>=5 && in<=10){
            System.out.println("Tax to be paid is "+(in*0.2));
        }

        if (in>10){
            System.out.println("Tax to be paid is "+(in*0.3));
        }

    }
}

// Q3) To find wheter the age entered is leap year or not

import java.util.Scanner;

public class conditionals {
    public static void main(String[] args) {

        System.out.println("Enter the year : ");
        Scanner y = new Scanner(System.in);
        int yr = y.nextInt();

        if (yr%4==0){
            System.out.println("It's a leap year!");
        }

        else {
            System.out.println("It's not a leap year");
        }

    }
}

// Q4) Write a program to find out the type of website from url

import java.util.Scanner;

public class conditionals {
    public static void main(String[] args) {

        System.out.println("Enter the url : ");
        Scanner u = new Scanner(System.in);
        String ur = u.nextLine();

        if (ur.endsWith(".com")){
            System.out.println("It's a commercial website");
        }

        if (ur.endsWith(".org")){
            System.out.println("It's an organisation website");
        }

        if (ur.endsWith(".in")){
            System.out.println("It's an indian website");
        }

    }
}
