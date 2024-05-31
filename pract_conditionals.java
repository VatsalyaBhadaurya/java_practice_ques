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


