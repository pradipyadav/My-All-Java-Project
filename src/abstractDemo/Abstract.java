package abstractDemo;

abstract public class Abstract
{
    Abstract()
    {
        System.out.println("Print Constructor");
    }
    abstract void call();
    void sms()
    {
        System.out.println("Send SMS");
    }

   abstract void game();
}

abstract class  Game extends Abstract
{
    void game() {

        System.out.println("Playing Games");
    }
}
abstract class Play extends Abstract{

    @Override
    void call() {
        System.out.println("Calling");

    }
}
class Student extends Abstract
{
    @Override
    void call() {

    }

    @Override
    void game() {

    }

    public static void main(String[] args) {
        Student p=new Student();
        p.call();
        p.sms();
        p.game();
    }
}