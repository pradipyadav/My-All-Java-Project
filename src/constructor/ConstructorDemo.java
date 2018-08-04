package constructor;

import java.util.Scanner;

public class ConstructorDemo {

    public ConstructorDemo(int a)
    {
        System.out.println("inside the constructor a : "+a);
    }

    void show()
    {
        System.out.println("in show method");
    }

    public static void main(String[] args) {
        ConstructorDemo constructorDemo=new ConstructorDemo(12);
        constructorDemo.show();
        Scanner scanner=new Scanner(System.in);
    }

}
