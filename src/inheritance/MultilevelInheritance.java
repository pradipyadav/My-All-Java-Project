package inheritance;

public class MultilevelInheritance
{

    int a=20;

    MultilevelInheritance()

    {
        System.out.println("Inside multilevel inheritance");
    }

    void show()

    {
        System.out.println("Inside First Show Method");
    }

}

class MultilevelInherit extends MultilevelInheritance
{
    void display()
    {
        System.out.println("Inside First Display Method");
    }
}

class MultilevelInhe extends MultilevelInherit
{
    void show ()
    {
        super.display();
        display();
        System.out.println("Inside Second Show Method");
    }
}

class Multilevel extends MultilevelInhe
{
    void display()
    {
        System.out.println("Inside Second Display Method");
    }

    public static void main(String[] args) {
        Multilevel m=new Multilevel();
        m.show();
    }
}