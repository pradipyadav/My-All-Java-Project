package interfaceDemo;

public interface Demo {
    void java();

    default void spring() {
        System.out.println("Start Spring Lecture");
    }

    static int duration(int a)
    {
        return (a*a);
    }
}

interface Lecture extends Demo
{

    void php();
}
class Fess implements Demo
{
    @Override
    public void java() {
        System.out.println("Start Java Lecture");
    }

    public void php()
    {
        System.out.println("Start php Lecture");
    }

    public static void main(String[] args) {
        Fess f=new Fess();
        f.java();
        f.php();
        f.spring();
        System.out.println("Duration: "+Demo.duration(3));
    }

}