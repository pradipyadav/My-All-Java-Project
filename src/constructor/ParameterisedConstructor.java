package constructor;

public class ParameterisedConstructor
{
    ParameterisedConstructor(int a,int b)
    {
        System.out.print("Parameterized Constructor");
        System.out.println(" having Two parameters");
        System.out.println("with values "+a+ " And "+ b);
    }
    ParameterisedConstructor(int a,int b,float c)
    {
        System.out.print("Parameterized Constructor");
        System.out.println(" having Three parameters");
        System.out.println("with values "+a+ " And  " + b+ " And " +c);
    }

    public static void main(String[] args) {
        new ParameterisedConstructor(12,13);
        new ParameterisedConstructor(12,12,12.5f);
    }
}
