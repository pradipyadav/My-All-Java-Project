package javaPractice;

import java.util.Scanner;

public class SwapTwoVariables
{
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of A: ");
        a=sc.nextInt();
        System.out.println("Enter the value of B: ");
        b=sc.nextInt();

        System.out.println("Before Swapping");
        System.out.println("Value of A: "+a);
        System.out.println("Value of B: "+b);

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("After Swapping");
        System.out.println("Value of A: "+a);
        System.out.println("Value of B: "+b);
    }
}
