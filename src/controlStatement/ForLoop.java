package controlStatement;

import java.util.Scanner;

public class ForLoop {
 /*   public static void main(String[] args) {

        for(int i=0;i<=7;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("*");

            }
            System.out.println("  ");
        }
    }
*/

/*    public static void main(String[] args) {

        for(int i=7;i>0;i--)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("*");

            }
            System.out.println("  ");
        }
    }
*/


    public static void printTriangle(int n) {

        int k = 2 * n - 2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(" ");
            }
            k = k - 1;
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        int n;
        System.out.println("n = ");
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        printTriangle(n);
    }
}


