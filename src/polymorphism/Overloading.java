package polymorphism;

public class Overloading
{
    void sum(int a,int b)
    {
        int c=a+b;
        System.out.println("Sum of two number is : "+c);
    }

    void sum()
    {
        System.out.println("This is a empty Method");
    }

    void sum(int a,String name)
    {
        System.out.println("Id : "+a+"  Name : "+name);
    }

    public static void main(String[] args) {
        Overloading o=new Overloading();
        o.sum();
        o.sum(20,10);
        o.sum(1,"Pradip");
    }
}
