package javaPractice;

import java.util.Scanner;

public class Clock {
    public static void main(String[] args) {
        int h,m,s,input;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Seconds");
        input=sc.nextInt();

        h=input/3600;
        m=(input%3600)/60;
        s=(input%3600)%60;

        System.out.println("hh:mm:ss");
        System.out.println(h+ " :"+m+ " :"+ s);
    }
}
