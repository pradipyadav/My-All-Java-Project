package controlStatement;
import java.util.Scanner;
public class Clock
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the seconds: ");
        int input = sc.nextInt();

        int hours = input / 3600;
        int minutes = (input % 3600) / 60;
        int seconds = (input % 3600) % 60;

        System.out.println(input+ " Seconds = "+hours+"hh : "+minutes+"mm : "+seconds+"ss");


    }






}
