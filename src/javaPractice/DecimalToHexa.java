package javaPractice;

import java.util.Scanner;

public class DecimalToHexa {
    public static void main(String[] args) {
        int d,r;
        String h=" ";

        char c[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Decimal Number:");
        d=sc.nextInt();

        while (d>0)
        {
            r=d%16;
            h=c[r]+h;
            d=d/16;
        }
        System.out.println("Hexadecimal Number Is= "+h);
    }


}