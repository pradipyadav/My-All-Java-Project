package newProject;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        int num,count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        num=sc.nextInt();

        if(num%2==0){
            count++;
        }
        if (count!=0)
            System.out.println("Not Prime Number");

        else
            System.out.println(" Prime Number ");
    }


}
