package exceptionHandling;

import java.util.Scanner;

public class ExceptionDemo {

    public static void main(String[] args) throws  Exception{

        int a,b,result;
        System.out.println("a abd b :");
        Scanner scanner=new Scanner(System.in);
        a=scanner.nextInt();
        b=scanner.nextInt();

        try {
            result=a/b;
            System.out.println(result);
        }
        catch (NullPointerException e)
        {
            System.out.println("inside catch");
            System.out.println(e);
        }


    }

}
