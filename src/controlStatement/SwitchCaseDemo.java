package controlStatement;

import java.util.Scanner;

public class SwitchCaseDemo {

    public static void main(String[] args) {

        int a=20;
        int b=10;
        int result;

        System.out.println("enter your choice : ");
        System.out.println("1. add\n"+"2. sub\n"+"3. mul\n"+"4. div");

        Scanner scanner=new Scanner(System.in);
        int caseNum=scanner.nextInt();
        switch (caseNum)
        {
            case 1:

                result=a+b;
                System.out.println(result);
                break;

            case 2 :
                result=a-b;
                System.out.println(result);
                break;

            case 3:
                result=a*b;
                System.out.println(result);
                break;

                default:
                    System.out.println("invalid case number");
        }

    }

}
