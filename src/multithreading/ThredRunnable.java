package multithreading;

public class ThredRunnable implements Runnable
{
    public void run()
    {
        System.out.println("Runnable Interface");
    }

    public static void main(String[] args) {
        ThredRunnable thredRunnable=new ThredRunnable();
        Thread thread=new Thread(thredRunnable);
        thread.start();
    }
}
