package javaPractice;

import java.util.Scanner;

public class DecimalToOctal
{
    public static void main(String[] args) {
        int d,r;
        String o=" ";

        char c[]={'0','1','2','3','4','5','6','7'};

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Decimal Number:");
        d=sc.nextInt();

        while (d>0)
        {
            r=d%8;
            o=c[r]+o;
            d=d/8;
        }
        System.out.println("Octal Number Is= "+o);
    }

}
