package controlStatement;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n,t1=0,t2=1,sum;
        System.out.print("Enter the value of n");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("First  "+n+"  terms");
        for (int i=1;i<=n;i++)
        {
            System.out.print(t1+"+");
            sum=t1+t2;
            t1=t2;
            t2=sum;


        }

    }
}
