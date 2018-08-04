package multithreading;

public class SleepMethod extends Thread
{
    public void run()
    {
       for (int i=0;i<5;i++) {
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               System.out.println();
           }

           System.out.println(i);
//           System.out.println("Sleep");
       }
    }

    public static void main(String[] args) {
        SleepMethod s=new SleepMethod();
        SleepMethod s1=new SleepMethod();

        s.start();
        s1.start();

        /*
        When Calling run Method Directly
         */
//        s.run();
//        s1.run();
    }
}
