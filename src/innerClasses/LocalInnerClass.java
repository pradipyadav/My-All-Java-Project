package innerClasses;

public class LocalInnerClass
{
    private int data=100;

    void call()
    {
        int value=300;
        class InnereClass
        {
            void phone()
            {
                System.out.println(value);
            }
        }
//        InnereClass i=new InnereClass();
//        i.phone();
    }

    public static void main(String[] args) {
        LocalInnerClass l=new LocalInnerClass();
        l.call();
    }
}
