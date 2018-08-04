package javaPractice;

import java.util.Scanner;

public class PossitiveOrNegative
{
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        n=sc.nextInt();

        if(n< 0)
        {
            System.out.println("Number " +n+ " is a negative number");
        }
        else if(n>0)
        {
            System.out.println("Number " +n+ " is positive number");
        }
        else
        {
            System.out.println("Nither possitive nor negative");
        }
    }
}
