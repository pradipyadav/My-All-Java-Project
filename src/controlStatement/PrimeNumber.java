package controlStatement;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        int num,i,count=0;
        System.out.println("Enter the Number");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();

            if (num%2 == 0)
            {
                count++;
            }
            if(count!=0)
            {
                System.out.println("Given Number is not Prime Number");
            }
            else
            {
                System.out.println("Given Number is a Prime Number");
            }

    }
}
