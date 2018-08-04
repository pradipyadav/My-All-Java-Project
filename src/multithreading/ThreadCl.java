package multithreading;

public class ThreadCl extends Thread
{
    public void run()
    {
        System.out.println("welcome Java");
    }

    public static void main(String[] args) {
        ThreadCl threadCl=new ThreadCl();
        threadCl.start();
    }
}
