public class CallByValue
{
    private static String[] args;

    void sum(int a, int b)
    {
        System.out.println("Add "+(a+b));
    }

    public static void main(String[] args) {

        CallByValue c=new CallByValue();
        c.sum(12,12);

    }

}
