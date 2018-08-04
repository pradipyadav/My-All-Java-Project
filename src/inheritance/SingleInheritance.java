package inheritance;

public class SingleInheritance {


    int a=10;

    SingleInheritance()
    {
        System.out.println("inside first constructor");
    }

     void show()
    {

        System.out.println("in first class");

    }

}

 class SecondInheritance extends SingleInheritance
{
    int a=20;

    SecondInheritance()
    {
        super();
        System.out.println("second constructor");
    }

     void show()
    {
        System.out.println(super.a);
        super.show();
        System.out.println("in second class");
    }
    public static void main(String[] args) {
        SecondInheritance s=new SecondInheritance();

        s.show();
    }
}
