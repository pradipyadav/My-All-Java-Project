package controlStatement;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        int x;
        System.out.println("Enter the integer value to check whether it odd or even ");

        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();

        if(x%2==0)
        {
            System.out.println("Entered Value is even");
        }
        else
        {
            System.out.println("Entered value is Odd");
        }



    }

}
