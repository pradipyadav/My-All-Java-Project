package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipalCatchBlock

{
   static String s=null;



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();


        System.out.println("Enter String Name");
        Scanner scanner=new Scanner(System.in);
       // s=scanner.nextLine();



        System.out.println("Enter the float value of c and d");
        double c = sc.nextDouble();
        double d = sc.nextDouble();

        try {
            try
            {
                int result = a / b;
                System.out.println("Result: " + result);
            }
            catch (ArithmeticException e)
            {
                System.out.println("In first catch block ArithmeticException");
            }
            catch (InputMismatchException e)
            {
                System.out.println("In first catch block InputMismatchException");
            }
            try
            {
                System.out.println("length of string: "+s.length());
            }
            catch (NullPointerException e)
            {
                System.out.println("In second catch block");
            }
            catch (NumberFormatException e)
            {
                System.out.println("Third catch block");
            }
            try
            {
                double ans = c - d;
                System.out.println("Float value: " + ans);
            }
            catch (ArithmeticException e)
            {
                System.out.println("In double catch block ArithmeticException");
            }
            }
        catch (Exception e)
        {
            System.out.println("Outer catch block");
        }
        System.out.println("Program Execution");
    }
}

