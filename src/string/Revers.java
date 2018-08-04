package string;

import java.util.Scanner;

public class Revers
{
    public static void main(String[] args) {
        String s;
        System.out.println("Enter String Name");
        Scanner scanner=new Scanner(System.in);
        s=scanner.nextLine();
        System.out.println("Reverse String is" +s);

        StringBuffer sb=new StringBuffer(s);


        sb.reverse();
        System.out.println(sb);


    }
}
