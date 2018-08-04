package multithreading;

public class ThreadClassTwo implements Runnable
{
    @Override
    public void run() {
      for(int i=0;i<5;i++)
        {
            try {
                Thread.sleep(500);
                System.out.println("Runnable "+i);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ThreadClassTwo tct=new ThreadClassTwo();
        Thread t=new Thread(tct);
        ThreadClassTwo tct1=new ThreadClassTwo();
        Thread t1=new Thread(tct1);
        t.start();
        t1.start();

    }
}
