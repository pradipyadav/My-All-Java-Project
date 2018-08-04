package javaPractice;

import java.util.Scanner;

public class SumOfIntegerBoolen
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number");
        int a=sc.nextInt();

        System.out.println("Enter second Number");
        int b=sc.nextInt();

        System.out.println("Enter Third Number");
        int c=sc.nextInt();

        System.out.println("Addition is: "+sum(a, b, c));
    }
    public static boolean sum(int x,int y,int z)
    {
        return ((x + y)==z || (y + z)==x || (z + x)==y);
    }
}
