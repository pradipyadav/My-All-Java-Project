package multithreading;

public class JoiningThread extends Thread
{
    public void run()
    {
        for (int i=1;i<=5;i++)
        {
            try
            {
                Thread.sleep(500);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        JoiningThread jt=new JoiningThread();
        JoiningThread jt1=new JoiningThread();
        JoiningThread jt2=new JoiningThread();

        jt2.start();
        try
        {
            jt2.join(1000);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        jt.start();
        jt1.start();
    }
}
