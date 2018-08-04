package javaPractice;

import java.sql.*;
import java.util.Scanner;

public class Calculator
{


    public static void main(String[] args) {

        double a,b;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter value a: ");
        a=sc.nextDouble();
        System.out.println("Enter the Operater like / * - + ");
        char operator=sc.next().charAt(0);
        System.out.println("Enter value b: ");
        b=sc.nextDouble();


        sc.close();
        double c = 0;

        switch (operator){

            case '/':
                c=a/b;
                break;

            case '*':
                c=a*b;
                break;

            case '-':
                c=a-b;
                break;

            case '+':
                c=a+b;
                break;


                default:
                    System.out.println("You Entered Invalid Operator: ");
        }
        System.out.println("Ans= "+a +" " +operator +b +" " +"=" +c);
    }

}