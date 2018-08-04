package controlStatement;

import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args) {
        int num,result=1;
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        while(num>0)
        {
            result=result*num;
            num--;
        }
        System.out.println("Factorial of given is: "+result);

    }
}
