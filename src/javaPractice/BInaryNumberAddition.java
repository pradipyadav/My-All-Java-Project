package javaPractice;

import java.util.Scanner;

public class BInaryNumberAddition {
    private static Scanner sc;

    public static void main(String[] args) {

        sc = new Scanner(System.in);
        System.out.println("Enter 1st Binary Number");
        int number1 = sc.nextInt();
        int reminder1 = 0;
        System.out.println("Enter 2nd Binary Number");
        int number2 = sc.nextInt();
        int reminder2 = 0;
        int carry = 0;
        double sumResult = 0;
        int add = 0;

        int n;
        int power = 0;
        while (number1 > 0 || number2 > 0) {

            /*System.out.println(number1 + " " +number2);*/

            reminder1 = number1 % 10;
            number1 = number1 / 10;
            reminder2 = number2 % 10;
            number2 = number2 / 10;
            /*System.out.println(reminder1 +"  "+ reminder2);*/


            if (reminder1 > 1 || reminder2 > 1) {
                System.out.println("not a binary number");
                System.exit(0);
            }

            n = reminder1 + reminder2 + carry;
            switch (n) {

                case 0:
                    add = 0;
                    carry = 0;
                    break;
                case 1:
                    add = 1;
                    carry = 0;
                    break;
                case 2:
                    add = 0;
                    carry = 1;
                    break;
                case 3:
                    add = 1;
                    carry = 1;
                    break;
                default:
                    System.out.println("not a binary number ");

            }

            sumResult = add * (Math.pow(10, power)) + sumResult;
            power++;


        }
        sumResult = carry * (Math.pow(10, power)) + sumResult;
        System.out.println("Addition is= "+ (int) sumResult);


    }
}
