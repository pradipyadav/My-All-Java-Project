package multithreading;

public class A_Thread extends Thread
{
    public void run()
    {
        for(int i=0;i<=5;i++)
        {
            System.out.println("Thread A: "+i);
        }
        System.out.println("Exit from Thread A");
    }
}
class B_Thread extends Thread
{
    public void run()
    {
        for(int j=0;j<=5;j++)
        {
            System.out.println("Thread B: "+j);
        }
        System.out.println("Exit from Thread B");
    }
}
class C_Thread extends Thread
{
    public void run()
    {
        for(int k=0;k<=5;k++)
        {
            System.out.println("Thread C: "+k);
        }
        System.out.println("Exit from Thread C");
    }
}
class MainThread{
    public static void main(String[] args) {
//        A_Thread a=new A_Thread();
//        B_Thread b=new B_Thread();
//        C_Thread c=new C_Thread();
//
//        a.start();
//        b.start();
//        c.start();

        new A_Thread().start();
        new B_Thread().start();
        new C_Thread().start();

        System.out.println("In Main Method");
    }
}
