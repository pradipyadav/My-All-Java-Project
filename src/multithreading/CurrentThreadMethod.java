package multithreading;

public class CurrentThreadMethod extends Thread
{
    public void run()
    {
        System.out.println(currentThread().getName());
        System.out.println(currentThread().getId());
    }

    public static void main(String[] args) {
        CurrentThreadMethod c=new CurrentThreadMethod();
        CurrentThreadMethod c1=new CurrentThreadMethod();

        c.start();
        c1.start();
    }
}
