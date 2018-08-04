package innerClasses;

public class StaticNestedClass
{
    static int a=30;
    static class Static
    {
        void msg()
        {
            System.out.println("This is Static Nested Class: "+a);
        }
        static void call()
        {
            System.out.println("Calling Static Method without Creting instance");
        }
    }

    public static void main(String[] args) {
        StaticNestedClass.Static obj=new StaticNestedClass.Static();
        obj.msg();

        StaticNestedClass.Static.call();   //Method call without Creating instance
    }
}
