package constructor;

public class DefaultConstructor
{
    DefaultConstructor()
    {
        int roll=101;
        String grade="Manager";
        System.out.println(+roll+ " = " +grade);
    }

    public static void main(String[] args) {
        DefaultConstructor sc=new DefaultConstructor();
    }
}
