package exceptionHandling;

import java.util.Scanner;

public class ThrowException
{
    public void grade(int a)
    {
        if(a<60)
        {
            throw new ArithmeticException("Fail");
        }
        else
            System.out.println("First Class");
    }

    public static void main(String[] args) {
        int a;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Grade");
        a=scanner.nextInt();
        new ThrowException().grade(a);
    }
}
