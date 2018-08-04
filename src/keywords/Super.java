package keywords;

public class Super {
/*    String m="Pradip";

}
class Class extends Super{

    String m="Yadav";

    void show()
    {
        System.out.println(m);
        System.out.println(super.m);
    }

    public static void main(String[] args) {
        Class c=new Class();
        c.show();


    }
    */

/*    void eat() {
        System.out.println("First Eat Method");
    }
}

    class Extend extends Super {
        void eat() {

            System.out.println("Print eating method");
        }

        void show() {
            super.eat();
            eat();
        }

        public static void main(String[] args) {
            Extend e=new Extend();
            e.show();
        }

    }

*/
void msg()
{
    System.out.println("Create ");
}

Super()
{
    System.out.println("Constuctor Super is Call");
}
}
class Outer extends Super
{
     Outer ()
    {

        System.out.println("Outer class is created");
    }
    void msg()
    {
        System.out.println("Create MSG");
    }

    public static void main(String[] args) {


      Super s=new Outer();
      s.msg();

    }
}