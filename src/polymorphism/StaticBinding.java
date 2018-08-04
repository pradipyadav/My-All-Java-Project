package polymorphism;

public class StaticBinding
{
    private void msg()
    {
        System.out.println("Enter The Message");
    }

    public static void main(String[] args) {
        StaticBinding a=new StaticBinding();
        a.msg();
    }
}

/*class Create extends StaticBinding
{
    void call()
    {
        System.out.println("Calling");
    }

  //public static void main(String[] args) {
    //    Create b=new Create();
      //  b.call();
    }
}
*/