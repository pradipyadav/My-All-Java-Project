package javaPractice;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the three numbers: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        if (a > b && a > c)
        {
            System.out.println("First number is Large value : "+a);
        }
        else if (b > c && b > a)
        {
            System.out.println("second number is Large value : "+b);
        }
        else if (c > a && c > b)
        {
            System.out.println("Third number is Large value : "+c);
        }
        else
        {
            System.out.println("write valid number");
        }
    }
}

