package multithreading;

public class Priority extends Thread
{
    public void run()
    {
        System.out.println("Check Priority "+Thread.currentThread().getName());
        System.out.println("Check Priority "+Thread.currentThread().getPriority());
    }

    public static void main(String[] args)
    {
        Priority p=new Priority();
        Priority p1=new Priority();

        p.setPriority(Thread.MAX_PRIORITY);
        p1.setPriority(Thread.MIN_PRIORITY);

//        System.out.println(p1.getPriority());
//        System.out.println(p.getPriority());

        p.start();
        p1.start();
    }
}
