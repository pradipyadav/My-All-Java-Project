package javaPractice;

import java.util.Scanner;

public class ArmstrongNumber
{
    public static void main(String[] args) {
        int num,n,check=0,reminder;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        num=scanner.nextInt();
        n=num;

        while (num>0)
        {
            reminder=num%10;
            check=check+(int) Math.pow(reminder,3);
            num=num/10;
        }
        if(check==n)
        {
            System.out.println(+n+" is an armstrong number");
        }
        else
        {
            System.out.println(+n+" Not armstrong number");
        }
    }
}
