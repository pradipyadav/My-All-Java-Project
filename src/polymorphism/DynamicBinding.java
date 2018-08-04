package polymorphism;

public class DynamicBinding
{

    void game()
    {
        System.out.println("Playing Games");
    }

}
class Student extends DynamicBinding
{
    void game()
    {
        System.out.println("Student Playing Games");
    }
    void call()
    {
        System.out.println("Calling");
    }

    public static void main(String[] args) {
        DynamicBinding d=new Student();
        d.game();


    }
}