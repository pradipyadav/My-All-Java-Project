package exceptionHandling;

import java.io.IOException;

public class ThrowsExceptionHand
{
    public void m() throws IOException{
        throw new IOException("System error");
    }
}
 class Test
{
    public static void main(String[] args)throws IOException {
        ThrowsExceptionHand throwsExceptionHand=new ThrowsExceptionHand();
        throwsExceptionHand.m();
        System.out.println("Print");
    }
}