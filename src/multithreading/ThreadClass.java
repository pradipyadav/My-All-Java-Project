package multithreading;

public class ThreadClass extends Thread
{
    public void run()
    {
        System.out.println("In run method");
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadClass tc=new ThreadClass();
        tc.start();
        tc.setName("Pradip");
        System.out.println( tc.getName());
        System.out.println("Main method");


       // tc.setPriority(10);

    }
}
