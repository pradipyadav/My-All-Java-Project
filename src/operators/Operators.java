package operators;
import constructor.ConstructorDemo;

import java.util.Scanner;
public class Operators
{
    void arithmeticOperators()
    {


        int a,b,add,sub,mul,div,mod;
        System.out.println("enter the value of a and b : \n");
        Scanner scanner=new Scanner(System.in);
        a=scanner.nextInt();
        b=scanner.nextInt();


        add=a+b;
        System.out.println("Addition:"+add);

        sub=a+b;
        System.out.println("Sustraction:"+sub);

        mul=a+b;
        System.out.println("Multiplication"+mul);


        div=a/b;
        System.out.println("Division"+div);

        mod=a%b;
        System.out.println("Mod"+mod);

        }

        void uneryOperators()
        {
            int c=10;
            int d=(c++)+c;
            c=(++d)+(++d);
            d=(c++)+(d++);
            c=d+10;
            System.out.println(c);

        }

    public static void main(String[] args) {
        Operators p=new Operators();
        //p.arithmeticOperators();
        p.uneryOperators();
    }

}
