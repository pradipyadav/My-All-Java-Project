package exceptionHandling;

import java.util.Scanner;

public class FinallyDemo {

    void vote(int age) throws ArithmeticException
    {
        if(age<18)
        {
            throw new ArithmeticException("note able to vote");
        }
        else
        {
            System.out.println("able to vote");
        }
    }

    public static void main(String[] args) {
        int age;
        Scanner scanner=new Scanner(System.in);
        age=scanner.nextInt();
     new FinallyDemo().vote(age);
    }

}
