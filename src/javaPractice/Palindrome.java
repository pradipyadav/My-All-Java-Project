package javaPractice;

import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args) {
        int n,r,sum=0,temp;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number to check palindrome or not");
        n=scanner.nextInt();
        temp=n;

        while (n>0)
        {
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if (temp==sum)
        {
            System.out.println("Given number is a palindrome number");
        }
        else
        {
            System.out.println("Given number is not a palindrome number");
        }
    }
}
