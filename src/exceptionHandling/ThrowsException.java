package exceptionHandling;

import java.io.IOException;

public class ThrowsException
{
    void m() throws IOException
    {
        throw new IOException("System error");
    }
    void n()throws IOException
    {
        m();
    }
    void p()
    {
        try {
            n();
        }
        catch (Exception e)
        {
            System.out.println("Exception Handeled");
        }
    }

    public static void main(String[] args) {
        ThrowsException t=new ThrowsException();
        t.p();
        System.out.println("Program in Execution");
    }

}
