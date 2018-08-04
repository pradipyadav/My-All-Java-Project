package controlStatement;
import java.util.Scanner;
public class SwitchCase
{
    static int a,b,result,caseNum;
    static Scanner scanner=new Scanner(System.in);




    void add()
    {
        result=a+b;
        System.out.println("Addition=" +result);
        elseIf();
        ifElse();


    }

    void sub()
    {
        result=a-b;
        System.out.println("Substraction=" +result);
        elseIf();
        ifElse();
    }

    void mul()
    {
        result=a*b;
        System.out.println("Multiplication=" +result);
        elseIf();
        ifElse();
    }

    void div()
    {
        result=a/b;
        System.out.println("Division=" +result);
        elseIf();
        ifElse();
    }

     void elseIf()
    {

        if(result<35)
        {
            System.out.println("Fail");

        }
        else if (result>=36 && result<60)
        {
            System.out.println("Pass class");

        }
        else if (result>=61 && result<66)
        {
            System.out.println("First Class");

        }
        else if(result>=67 && result<100)
        {
            System.out.println("Distingtion");
        }
        else
        {
            System.out.println("Percentage Greater Than 100");
        }
    }

    void ifElse()
    {
        if(result%2==0)
        {
            System.out.println("Even Number");
        }

        else
        {
            System.out.println("Odd Number");
        }
    }

    void switchCaseDemo()
    {
        System.out.println("Enter the number");
        a=scanner.nextInt();
        b=scanner.nextInt();
        switch (caseNum)

        {
            case 1:
                add();
                break;
                case 2 :
                    sub();
                    break;
                    case 3:
                        mul();
                        break;
                        case 4:
                            div();
                            break;


                default:
                    System.out.println("invalid case number");



        }

    }

    public static void main(String[] args) {

        System.out.println("enter your choice : ");
        System.out.println("1. add\n"+"2. sub\n"+"3. mul\n"+"4. div");

        caseNum=scanner.nextInt();

        SwitchCase p=new SwitchCase();
        p.switchCaseDemo();

    }

}


