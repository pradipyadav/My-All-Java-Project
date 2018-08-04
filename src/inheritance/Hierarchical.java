package inheritance;

public class Hierarchical {

    void dog()
    {
        System.out.println("Dog Color is white");
    }
}
class Cat extends Hierarchical{

    void color()
    {
        System.out.println("Cat color is black");
    }
}
class  Monkey extends Hierarchical
{
    void color()
    {
        System.out.println("Monkey Color is Silver");
    }
}
class Show
{
    public static void main(String[] args) {
        Monkey m=new Monkey();
        m.color();
        m.dog();
    }
}