package multithreading;

public class SetNameGetName extends Thread
{
    public void run()
    {
        System.out.println("Name set ");
    }

    public static void main(String[] args)
    {
        SetNameGetName s1=new SetNameGetName();
        SetNameGetName s2=new SetNameGetName();
        SetNameGetName s3=new SetNameGetName();

        System.out.println("Name of S1: "+s1.getName());
        System.out.println("Name of S2: "+s2.getName());
        System.out.println("Id of S3: "+s3.getId());

        s1.start();
        s2.start();

        s1.setName("Pradip");
        s2.setName("Yadav");

        System.out.println("Name of t1: "+s1.getName());
        System.out.println("Name of t2: "+s2.getName());

    }
}
