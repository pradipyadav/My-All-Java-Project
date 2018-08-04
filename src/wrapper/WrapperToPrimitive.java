package wrapper;

import java.util.Scanner;

public class WrapperToPrimitive
{
    public static void main(String[] args) {

        Integer a;
        System.out.println("Enterr Value");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        System.out.println("You Entered: "+a);
        int i=a.intValue();
        int j=a;

        System.out.println("Primitive values are "+a+" "+i +" "+j);



    }
}
