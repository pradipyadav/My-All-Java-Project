package exceptionHandling;

import java.io.IOException;

public class Parent
{
    void msg()throws Exception
    {
        System.out.println("Parent class");
    }
}
class Child extends Parent
{
    void msg()throws ArithmeticException
    {
        System.out.println("Clild class");
    }

    public static void main(String[] args) {
        Parent p=new Child();
//        p.msg();
        try {
            p.msg();
        }
        catch (Exception e)
        {
            System.out.println("Print catch");
        }
    }
}