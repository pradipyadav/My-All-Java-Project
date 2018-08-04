package controlStatement;

import java.util.Scanner;
public class IfElseDemo
{
    void ifElse()
    {
        int num;
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();


        if(num%2==0)
        {
            System.out.println("Even");
        }

        else
        {
            System.out.println("Odd");
        }
    }

   static void elseIf()
    {
        int percentage;
        System.out.println("enter the percentage : ");
        Scanner scanner=new Scanner(System.in);
        percentage=scanner.nextInt();


        if(percentage<35)
        {
            System.out.println("Fail");

        }
        else if (percentage>=36 && percentage<60)
        {
            System.out.println("Pass class");

        }
        else if (percentage>=61 && percentage<66)
        {
            System.out.println("First Class");

        }
        else if(percentage>=67 && percentage<100)
        {
            System.out.println("Distingtion");
        }
        else
        {
            System.out.println("Invalid");
        }
    }
    public static void main (String[] args)
    {
        IfElseDemo p=new IfElseDemo();
        //p.ifElse();
        p.elseIf();

    }
}
